/**
 * Class that prints the translated message.
 * 
 * @author Adam McAvoy
 * @version 3/13/17
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        MorseCode m = new MorseCode("morsecodereference.txt");
        System.out.println("Please enter a sentance without punctuation.");
        String userInput = in.nextLine();
        m.getMessage(userInput);
    }
}