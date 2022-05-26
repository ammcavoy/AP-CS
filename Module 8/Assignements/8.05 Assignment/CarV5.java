/**
 *
 * Calculates the value of PI by simulating a dart being thrown on a board.
 *
 * @version 12/8/2016
 *
 * @author Adam McAvoy
 */

import java.util.Scanner;

public class CarV5
 {
    public static int tripMiles, startMiles, endMiles;
    public static double MPG, gallons, price, cost, GPM;
    public class Car
    {
        String name;
        int startMiles, endMiles;
        double gallons, price;
        
        public Car(String name, int startMiles, int endMiles, double gallons, double price)
        {
            this.name = name;
            this.startMiles = startMiles;
            this.endMiles =  endMiles;
            this.gallons = gallons;
            this.price = price;
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
    static double calcCost (double price, double gallons)
    {
        return cost = price * gallons;
    }
    static double calcGPM (double gallons, int tripMiles)
    {
        return GPM = gallons/tripMiles;
    }
     public static void main(String[] args)
    {
        System.out.print('\u000C'); 
        String name;
        int tripMiles, startMiles, endMiles;
        double MPG, gallons, price, cost, GPM;
        
        //CarV5 car1 = new CarV5(name, endMiles, startMiles, gallons, price);
        CarV5  carv1 = new CarV5();
        Car car1 = carv1.new Car("01 Honda Odessey", 242678, 242992, 14.6, 2.21);
        
        tripMiles = calcTripMiles(car1.startMiles, car1.endMiles);
        MPG = calcMPG(tripMiles, car1.gallons);
        cost = calcCost(car1.price, car1.gallons);
        GPM = calcGPM(car1.gallons, tripMiles);
        
        System.out.printf("%20s %15s %15s %15s %15s %15s %15s %15s %15s\n","Types of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "cost", "Miles/Gallons", "Gallons/Miles");
        System.out.println("================================================================================================================================================================");
        System.out.printf("%20s %15s %15s %15s %15s %15s %15.4s %15.4s %15.4s", car1.name, car1.startMiles, car1.endMiles, tripMiles, car1.gallons, car1.price, cost, MPG, GPM);
        
        
        
    }
 }