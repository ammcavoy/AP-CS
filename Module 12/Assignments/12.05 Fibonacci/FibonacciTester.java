/**
 * This class tests recursive methods
 * 
 * @author Adam McAvoy
 * @version 03/02/17
 */
import java.util.Scanner;
class Fibonacci 
{
    Fibonacci()
    {
    }
    public int fibonacci(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if( n == 2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-2) + fibonacci(n - 1);
        }
    }    
}
public class FibonacciTester
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        Fibonacci test = new Fibonacci();
        String userInput = "";
        
        System.out.println("The program will return your Fibonacci Number");
        System.out.println("If you wish to stop running program enter q");
        while(!userInput.equalsIgnoreCase("q"))
        {
            System.out.print("Please enter an Int (q to quit): ");
            userInput = in.next();              
            if(userInput.equalsIgnoreCase("q"))
            {
                System.out.println("Thank you for running out Fibonacci Program");   
            }
            else
            {
                int userInputInt = Integer.parseInt(userInput);
                if(userInputInt < 1)
                {
                    System.out.println("Sorry we can't calculate Fibonacci number for that");
                }
                else
                {
                    System.out.println("The fibonacci number for " + userInput + " is " + test.fibonacci(userInputInt));
                }           
            }                
        }
        
    }
}
