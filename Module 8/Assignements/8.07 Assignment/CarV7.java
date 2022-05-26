/**
 *
 * Calculates the value of PI by simulating a dart being thrown on a board.
 *
 * @version 12/8/2016
 *
 * @author Adam McAvoy
 */

import java.util.Scanner;

public class CarV7
 {
    public static int tripMiles, startMiles, endMiles;
    public static double MPG, gallons, price, cost, GPM;
    public static String name;
        CarV7(String name, int startMiles, int endMiles, double gallons, double price)
        {
            this.name = name;
            this.startMiles = startMiles;
            this.endMiles =  endMiles;
            this.gallons = gallons;
            this.price = price;
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
}
