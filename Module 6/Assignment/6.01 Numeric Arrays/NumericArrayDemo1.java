/**
 * This program demonstrates how to assign values to individual
 * positions in a String array.
 * 
 * @author B. Jordan 
 * @version 03/29/07
 */
import java.util.Scanner;
public class NumericArrayDemo1
{
    public static void main(String [] args)
    {
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        
        int [ ] intValues;
        int intNum = 0;
        
        intValues = new int[11];
        
        
        intValues[0] = 23;
        intValues[1] = 62;
        intValues[2] = 83;
        intValues[3] = 74;
        intValues[4] = 05;
        intValues[5] = 96;
        intValues[6] = 87;
        intValues[7] = 99;
        intValues[8] = 54;
        intValues[9] = 97;
        
        while(intNum  <= 10)
        {
            System.out.print("Enter a number from 1 -10 (11 to quit): ");
            intNum = in.nextInt();
            
            if(intNum <= 10)
            {            
                System.out.println("Int number " + intNum + " is: " + intValues[intNum - 1] + ".  it is in array position " + (intNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you, all Int's are in the array.");
            }
        }
       
       }
    }
