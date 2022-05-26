
/**
 * This program changes words in a string to text messgae abreviations and also some string methods
 * 
 * @author Adam McAvoy
 * @version 10/12/2016
 */

import java.util.Scanner;
public class TargetZone
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter age: ");
      double age = in.nextDouble();
      System.out.print("Please enter resting heart rate: ");
      double restingHeartRate = in.nextDouble();
      System.out.print("Please enter heart rate after exercising: ");
      double exersizeHeartRate = in.nextDouble();
      System.out.println();
      
      double maxHeartRate = 206.9 - (0.67 * age);
      double heartRateReserve = maxHeartRate - restingHeartRate;
      double lowEndTrainingZone = (heartRateReserve * .65) + restingHeartRate;
      double highEndTrainingZone = (heartRateReserve * .85) + restingHeartRate;
      
      System.out.println("Target heart rate zone: " + (int)lowEndTrainingZone + "-" + (int)highEndTrainingZone );
      
      boolean belowTarget = exersizeHeartRate < lowEndTrainingZone;
      if (belowTarget)
        System.out.println("After just exerzizing, your heart rate is Below your target zone");
      boolean inTarget = exersizeHeartRate > lowEndTrainingZone && exersizeHeartRate < highEndTrainingZone;
      if(inTarget)
        System.out.println("After just exerzizing, your heart rate is IN your target zone");
      boolean aboveTarget = exersizeHeartRate > highEndTrainingZone;
      if(aboveTarget)
        System.out.println("After just exerzizing, your heart rate is ABOVE your target zone");
      
      
    }
}