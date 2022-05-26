
/**
 * This program changes words in a string to text messgae abreviations and also some string methods
 * 
 * @author Adam McAvoy
 * @version 10/12/2016
 */

import java.util.Scanner;
public class GPAV1
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter name: ");
      String studentName = in.nextLine();
      
      System.out.println("GPA Calculator \n");
      System.out.println("Please enter 5 grades seperated by a space(e.g. 4 3 2 1 4): ");
      
      int grade1 = in.nextInt();
      int grade2 = in.nextInt();
      int grade3 = in.nextInt();
      int grade4 = in.nextInt();
      int grade5 = in.nextInt();
      
      double average = (grade1 + grade2 + grade3 + grade4 + grade5)/5.0;
      
      boolean isEligible = average >= 2.0;
      
      System.out.println("GPA: " + average);
      System.out.println("Eligible: " + isEligible);
      
      
    }
}