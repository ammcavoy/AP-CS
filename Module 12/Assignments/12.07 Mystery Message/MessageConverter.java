
/**
 * Write a description of class hjdsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MessageConverter
{
    public static void main(String[] args) throws IOException
    {
        Scanner inFile = new Scanner(new File("Message.txt"));
        String oldLetter = "";
        String newLetter = "";
        char oldChar;
        char newChar;
        String newMessage = "";
        while(inFile.hasNext())
        {
            oldLetter = inFile.next();
            oldChar = oldLetter.charAt(0);
            if(oldChar == 97)
            {
                newChar = 122;
            }
            else
            {
                int newChars = (int)oldChar - 1;
                newChar = (char)newChars;
            }
            System.out.println(newChar);
        }
         
    }
}

