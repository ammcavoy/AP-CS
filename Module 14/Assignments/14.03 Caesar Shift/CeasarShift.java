
/**
 * Write a description of class hjdsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CeasarShift
{
    public CeasarShift() throws IOException
    {
        
    }
    public static String decrypt(String message, int shift)
    {
        char oldChar;    
        char newChar;
        int charInt;
        String newMessage = "";
        for(int n = 0; n < message.length(); n++)
        {
            oldChar = message.charAt(n);
            charInt = (int)oldChar - shift;
            if(charInt < 97)
            {
                int i = 97 - charInt;
                charInt = 122 - i;
            }
            newChar = (char)charInt;
            newMessage += newChar;
        }
        return newMessage;    
             
    }
    public static String encrypt(String message, int shift)
    { 
        
        char oldChar;    
        char newChar;
        int charInt;
        String newMessage = "";
        for(int n = 0; n < message.length(); n++)
        {
            oldChar = message.charAt(n);
            charInt = (int)oldChar + shift;
            if(charInt > 122)
            {
                int i = charInt - 122;
                charInt = 97 + i;
            }
            newChar = (char)charInt;
            newMessage += newChar;
        }
        return newMessage;    
     
    }
}

