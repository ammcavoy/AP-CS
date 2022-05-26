
/**
 * Write a description of class ArrayDemos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumericArrayDemo3
{
    public static void main(String [] args)
    {
        System.out.print('\u000C');
        double [] doubleValue = new double[6]; 

        Scanner in = new Scanner(System.in);

        for(int n = 0; n <= 4; n++)
        {
            System.out.println("Enter the value of double number " + (n + 1) + ": ");
            doubleValue[n] = in.nextDouble();
        }
            
        for(int n = 0; n <= 4; n++)
        {
            System.out.println("double number " + (n + 1) + " is: " 
                                  + doubleValue[n] + ".  It is in array position " 
                                  + n + ".");
        }  
                System.out.println("Thank you, all dwarfs are in the array.");

        }
    }
