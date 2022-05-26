
/**
 * Write a description of class ArrayDemos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NumericArrayDemo2
{
    public static void main(String [] args)
    {
        System.out.print('\u000c');
        Scanner in = new Scanner(System.in);
        
        int [] numbers = {12,43,65,23,89,63,85,28,52,83,17,25,92,35,48,69,39,60,20,40};
        int intNum = 0;
        
        while(intNum  <= 20)
        {
            System.out.print("Enter a number from 1 - 20 (21 to quit): ");
            intNum = in.nextInt();
            
            if(intNum <= 20)
            {            
                System.out.println("Int number " + intNum + " is: " 
                                  + numbers[intNum - 1] + ".  It is in array position " 
                                  + (intNum - 1) + ".");
            }
            else
            {
                System.out.println("Thank you, all Int's are in the array.");
            }
        }
        
        
        
        
        
       }
    }
