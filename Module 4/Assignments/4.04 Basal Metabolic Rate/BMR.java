
/**
 * This program 
 * 
 * @author Adam McAvoy
 * @version 10/25/2016
 */

import java.util.Scanner;
public class BMR
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter first name: ");
      String firstName = in.next();
      System.out.print("Please enter gender (M of F): ");
      String gender1 = in.next();
      //char gender2 = gender1.charAt(0);
      System.out.print("Please enter your age: ");
      int age = in.nextInt();
      System.out.print("Please enter height (in inches): ");
      double heightInches = in.nextDouble();
      System.out.print("Please enter weight (in pounds): ");
      double weightPounds = in.nextDouble();
      
      double heightCentimeters = heightInches * 2.54;
      double weightKilograms = weightPounds * .453592;
      double BMR;
      
      
      
      boolean male = gender1 == "M";
      
      if(male)
       BMR = (13.7516 * weightKilograms) + (5.0033 * heightCentimeters) - (6.755 * age) + 66.473;
      else
       BMR = (9.5634 * weightKilograms) + (1.8496 * heightCentimeters) - (4.6756 * age) + 655.0955;
       
       
     System.out.println("\n Calculate your Basal Metabolic Rate \n");
     System.out.println("Name: " + firstName);
     System.out.println("Gender: " + gender1);
     System.out.println("Age: " + age);
     System.out.println("Weight (kg): " + (double)weightKilograms);
     System.out.println("Height (cm): " + (double)heightCentimeters);  
     System.out.println("Basal Metabolic Rate: " + (double)BMR + " calories per day");
     
     
  
      
       
       
       
       
       
       
    }
}