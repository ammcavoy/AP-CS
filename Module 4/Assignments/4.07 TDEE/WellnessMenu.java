/**
 * Program to calculate the total daily energy expenditure
 * 
 * @author Adam McAvoy
 * @version 10/31/2016
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class WellnessMenu
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in = new Scanner(System.in);
      DecimalFormat formatter = new DecimalFormat("#0.00");
      double activityFactor = 0.0;
      
      System.out.print("Please enter your name: ");
      String name = in.nextLine();
      System.out.print("Please enter your BMR: ");
      double BMR = in.nextDouble();
      System.out.print("Please enter your gender (M/F): ");
      String gender = in.next();
      
      if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))
      {
          System.out.println("\n Select your activity level");
          System.out.println("[0] Resting (Sleeping, Reclining)");
          System.out.println("[1] Sedentart (Minimal Movement");
          System.out.println("[2] Light (Sitting, Standing)");
          System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike");
          System.out.println("[4] Very Active (Team Sports, Hard Maual Labor)");
          System.out.println("[5] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
      
          System.out.println("\n Enter the number corresponding to your activity level: ");
          int choice = in.nextInt();
      
          
      
        if(gender.equalsIgnoreCase("M"))
        {
            if(choice == 0)
            {
                activityFactor = 1.0;
            }
            else if(choice == 1)
            {
                activityFactor = 1.3;
            }
            else if(choice == 2)
            {
                activityFactor = 1.6;
            }
            else if(choice == 3)
            {
                activityFactor = 1.7;
            }
            else if(choice == 4)
            {
                activityFactor = 2.1;
            }
            else if(choice == 5)
            {
                activityFactor = 2.4;
            }
            else
            {
                System.out.println("You did not enter a valid number.")the
        }
      
        if(gender.equalsIgnoreCase("F"))
        {
            if(choice == 0)
            {
                activityFactor = 1.0;
            }
            else if(choice == 1)
            {
                activityFactor = 1.3;
            }
            else if(choice == 2)
            {
                activityFactor = 1.5;
            }
            else if(choice == 3)
            {
                activityFactor = 1.6;
            }
            else if(choice == 4)
            {
                activityFactor = 1.9;
            }
            else if(choice == 5)
            {
                activityFactor = 2.2;
            }
            else
            {
                System.out.println("You did not enter a valid number.");
            }
        }
         double TDEE = BMR * activityFactor;  
      
         System.out.println("Name: " + name + "\t Gender: " + gender);
         System.out.println("BMR: " + formatter.format(BMR) + " Calories" + "\t Activity Factor: " + activityFactor);
         System.out.println("TDEE: " + formatter.format(TDEE) + " Calories" );
    }
    else
    {
        System.out.println("you did not enter a valid gender.");
    }
        
     
    
    }
}