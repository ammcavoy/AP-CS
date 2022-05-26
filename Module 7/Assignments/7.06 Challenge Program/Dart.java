
/**
 *
 * Calculates the value of PI by simulating a dart being thrown on a board.
 *
 * @version 12/8/2016
 *
 * @author Adam McAvoy
 */

import java.util.Scanner;

public class Dart
 {
    public static Scanner in = new Scanner(System.in);
    public static double x = (2 * Math.random() - 1);
    public static double y = (2 * Math.random() - 1);
    public static double radius = 1.0;
    public static double numX, numY, numHits, pi, avg, total;
    public static int numThrows, trails;
    static int hits(double x, double y, int trails) 
    {
        numHits = 0;

        for (int i = 1; i < trails; i++) 
        
        {
            x = (2 * Math.random() - 1);
            y = (2 * Math.random() - 1);
            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2))) 
            {
                numHits++;
            }
        }
        return (int) numHits;
    }
    
    public static double calcPi(double numHits, double numThrows)
    {
        return (4 * (numHits) / numThrows);
    }

    public static void main(String[] args)
    {
        System.out.print('\u000C'); 
        System.out.println("Times dart will be thrown per trial");
        numThrows = in.nextInt();

        System.out.println("Amount of trials");
        trails = in.nextInt();

        for (int i = 0; i < trails; i++) 
        {
            int hits = hits(x,y,numThrows);
            double estimatedPi = calcPi(hits,numThrows);
            total += estimatedPi;
            System.out.printf("Trial " + (i + 1) + ": pi = %12f\n", estimatedPi);
        }
        double averagePi = (total / trails);

        System.out.printf("Average Calculation of Pi: %1.5f", averagePi);
    }

}
