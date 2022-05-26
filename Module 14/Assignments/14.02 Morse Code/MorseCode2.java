
/**
 * Write a description of class MorseCode2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode2
{
    
    public MorseCode2() throws IOException
    {
       Scanner in = new Scanner(System.in);
       String morseCode = "";
       System.out.println("Enter a word or phrase you wish to have converted to morse code.");
       String userInput = in.next();
       
       
       for(int n = 0; n < userInput.length(); n++)
       {
           String letter = userInput.substring(n);
           if(letter == "")
           {
               morseCode += "  ";               
           }
           else
           {
               morseCode += getCode(letter);               
           }
           
       }
       System.out.println(morseCode);
    }
   
    public static String getCode(String letter) throws IOException
    {
        Scanner inFile = new Scanner(new File("morseCodeKey.txt"));
        String code = "";
        while(inFile.hasNextLine())
        {
            String line = inFile.nextLine();
            int lineLength = line.length();
            String key = line.substring(0);
            
           if(letter == key)
            {
                code = line.substring(2,lineLength);
            }
        }
        return code;
    }
}
