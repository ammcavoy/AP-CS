
/**
 *
 * Calculates the value of PI by simulating a dart being thrown on a board.
 *
 * @version 12/8/2016
 *
 * @author Adam McAvoy
 */

import java.util.Scanner;

public class CarV3
 {
    public static int tripMiles, startMiles, endMiles;
    public static double MPG, gallons;
    public class Car
    {
        String name;
        int tripMiles, startMiles, endMiles;
        double MPG, gallons;
        
        public Car(String name, int startMiles, int endMiles, double gallons)
        {
            this.name = name;
            this.startMiles = startMiles;
            this.endMiles =  endMiles;
            this.gallons = gallons;
        }
    }

    static int calcTripMiles (int startMiles, int endMiles)
    {
        return tripMiles = endMiles - startMiles;
    }
    static double calcMPG (int tripMiles, double gallons)
    {
        return MPG = tripMiles/gallons;
    }
     public static void main(String[] args)
    {
        System.out.print('\u000C'); 
        String name;
        int tripMiles, startMiles, endMiles;
        double MPG, gallons;
        
        //CarV3 car1 = new CarV3(name, endMiles, startMiles, gallons);
        CarV3  carv1 = new CarV3();
        Car car1 = carv1.new Car("03 Honda Odessey", 242678, 242992, 14.6);
        
        tripMiles = calcTripMiles(car1.startMiles, car1.endMiles);
        MPG = calcMPG(tripMiles, car1.gallons);
        
        System.out.printf("%20s %15s %15s %15s %15s %15s\n","Types of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gallons");
        System.out.println("===========================================================================================================");
        System.out.printf("%20s %15s %15s %15s %15s %15.4s", car1.name, car1.startMiles, car1.endMiles, tripMiles, car1.gallons, MPG);
    }
 }