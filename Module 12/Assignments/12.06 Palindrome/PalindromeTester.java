 /**
 * This class tests recursive methods
 * 
 * @author Adam McAvoy
 * @version 03/02/17
 */
import java.util.Scanner;
class Palindrome 
{
    Palindrome()
    {
    }
    public boolean palindrome(String input)
    {
        input = input.replaceAll("\\s+","");
        int length = input.length();
        String output = "";
        for(int n = 0; n < length; n++)
        {                
            output += input.substring(length-(n+1), length-n);
        }
        
        if(output.equalsIgnoreCase(input))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class PalindromeTester
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        Palindrome test = new Palindrome();
        String userInput = "";
        
        System.out.println("The program will determine if your word or phrase is a Palidrome");
        System.out.println("If you wish to stop running program enter q");
        while(!userInput.equalsIgnoreCase("q"))
        {
            System.out.print("Please enter an word or phrase (q to quit): ");
            userInput = in.nextLine();              
            if(userInput.equalsIgnoreCase("q"))
            {
                System.out.println("Thank you for running our Palindrome Program");   
            }
            else
            {
                if(test.palindrome(userInput) == true)
                {
                    System.out.println(userInput + " is a palindrome");
                }
                else
                {
                     System.out.println(userInput + " is not a palindrome");
                }
            }                
        }
        
    }
}