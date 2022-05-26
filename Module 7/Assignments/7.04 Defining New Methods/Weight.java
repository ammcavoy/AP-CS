 /** calculates the weight of a 100lb person on each planet
 *
 * @author adam m
 * @version 12/8/2016
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Weight
{
        public static double [] getGravity()throws IOException
    {
        File gravityTxt = new File("gravity.txt");
        Scanner inFile =  new Scanner(gravityTxt);
        int index = 0;
        double [] gravity = new double[9]; 
        while(inFile.hasNext())
        {
            gravity[index] = inFile.nextDouble();
            gravity[index] = gravity[index]/9.794740681676519;
            index++;
        }
        return gravity;
    }
    
    public static double [] calcWeight(double earthWeight, double [] gravity)
    {
        double [] weight = new double[9];
        for(int n = 0; n < gravity.length; n++)
        {
            weight[n] = earthWeight * gravity[n];
        }
        return weight;
    }
    
    public static void printResults(String [] names, double [] gravity, double [] weight)
    {
        System.out.printf("%30s\n", "My Weight on the Planets");
        System.out.printf("%-9s %12s %12s\n", "Planet", "Gravity", "Weight(lbs)");
        System.out.println("-------------------------------------");
        for(int n = 0; n < gravity.length; n++)
        {
            System.out.printf("%-9s %11.2f %10.2f\n", names[n], gravity[n], weight[n]);
        }
    }

    public static void main(String[] args)throws IOException
	{
        System.out.print('\u000C');
	double earthWeight = 100.0; 

	String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
	double[] gravity = getGravity(); 							
	double[] weight = calcWeight(earthWeight, gravity);  
	printResults(names, gravity, weight); 					

    } //end main
}//end class
