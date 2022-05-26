
/**
 * This program changes words in a string to text messgae abreviations and also some string methods
 * 
 * @author Adam McAvoy
 * @version 10/12/2016
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class TargetZone
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter your name (first last): ");
      String name = in.nextLine();
      System.out.print("Enter your weight in pounds(e.g 175): ");
      double weightPounds = in.nextDouble();
      System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
      int heightFeet = in.nextInt();
      int heightInches = in.nextInt();
      
      double weightKilograms = weightPounds * .453592;
      double heightMeters1 = (double)heightFeet * .3048;
      double heightMeters2 = (double)heightInches * .0254;
      double heightMeters3 = heightMeters1 + heightMeters2;
      
      double BMI = weightKilograms/(heightMeters3 * heightMeters3);
      
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      System.out.println("Body Mass Index Calculator");
      System.out.println("==========================");
      System.out.println("Name: " + name);
      System.out.println("Height (m): " + formatter.format(heightMeters3));
      System.out.println("Weight (kg): " + formatter.format(weightKilograms));
      System.out.println("BMI: " + formatter.format(BMI));
      
      
      if(BMI<= 18.5)
        System.out.println("Category: Under Weight");
      else if(BMI<= 24.9)
        System.out.println("Category: Healthy Weight");
      else if(BMI<= 29.9)
        System.out.println("Category: Over Weight");
      else
        System.out.println("Category: Obese");
        
        
        
        
      
      
      
      
    }
}