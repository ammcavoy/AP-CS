/**
 * Description for 7.03 Gravity
 *
 * @author (Your Name)
 * @version (The Date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Gravity
{
    public static double[] calcGravity(double[] radius, double[] mass)
    {
        double [] gravity = new double[9];
        for(int n = 0; n < gravity.length; n++)
        {
            gravity[n] = (6.67E-11 * mass[n])/Math.pow(1000 * radius[n],2);
        }
        return gravity;
    }

    public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
    {
            System.out.print('\u000C');
            System.out.printf("%32s\n", "Planetary Data");
            System.out.printf("%-12s %-17s %7s %11s\n", "Planet", "Diameter (km)", "Mass(kg)", "g (m/s^2)");
            for(int n = 0; n < gravity.length; n++)
            {
                System.out.printf("%-12s %-14.0f %10.2e %10.2f\n",name[n], radius[n]*2, mass[n], gravity[n]);
            }
    }
    
    public static void printToFile(double[] gravity)throws IOException
    {
        PrintWriter outfile = new PrintWriter(new File("gravity.txt"));
        for(int n = 0; n < gravity.length; n++)
        {
            outfile.println(gravity[n]);
        }
        outfile.close();
    }

    public static void main(String[] args)throws IOException
    {
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
        double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};

        double[] gravities = calcGravity(radii, masses);

        printResults(names, radii, masses, gravities);
        printToFile(gravities);
    } //end main
}//end class