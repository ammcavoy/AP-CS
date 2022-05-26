/**
 * Converts Morse Code into English.
 * 
 * @author Adam McAvoy
 * @version 3/13/17
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode
{
 public static ArrayList<Character> chars;
 public static ArrayList<String> codes;
 
 /**
  * This Constructor actually imports the list of Morse Code Characters and adds it to an ArrayList.
  */
 public MorseCode(String fileName) throws IOException
 {
    Scanner inFile = new Scanner(new File("morsecodereference.txt"));
    int lineLength;
    char c;
    String code = "";
    String line;
    chars = new ArrayList<Character>();
    codes = new ArrayList<String>();
     while(inFile.hasNext())
     {
         line = inFile.nextLine();
         lineLength = line.length();
         c = line.charAt(0);
         code = line.substring(3, lineLength);
         chars.add(c);
         codes.add(code);
        }
 }
 
 public static String getMorse(String s)
 {
    int index = chars.indexOf(s);
    return codes.get(index);
 }

 public static String getMessage(String u) throws IOException
 {
    String letter = "";
    String message = "";
    int stringLength = u.length();
    for(int n = 0; n <= stringLength; n++)
    {
        letter = u.substring(n);
        letter = letter.toUpperCase();
        message += getMorse(letter) + " ";
    }
     
     
     return message;
 }
}