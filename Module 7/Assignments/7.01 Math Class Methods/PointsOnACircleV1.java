/**
*find and print point of a circle with radius of 1
* 
* @author Adam McAvoy
* @version 12/5/2016
*/
import java.util.Scanner; 
import java.io.FileReader; 
import java.io.IOException; 
import java.io.PrintWriter;
import java.io.File; 
import java.util.Random;
public class PointsOnACircleV1
{
   public static void main(String[]args) throws IOException
   {
    System.out.print('\u000C'); 
    Scanner in = new Scanner(System.in);
    
    
    double radius = 1.00;
    double x;
    double y1 = 0.00;
    double y2 = 0.00;
    System.out.println("Point on a circle of Radius " + radius);
    System.out.printf("%5s %7s %14s %7s\n", "x1", "y1", "x1", "y2");
    System.out.println("===============================================");
    for(x = radius; x >= -radius; x-=.1)
    {
        y1 = Math.abs(Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2)));
        y2 = -Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
        if(x>=0)
        {
            System.out.printf("%5.4s %7.4s %14.4s %7.5s\n", x, y1, x, y2); 
        }
       
        else if(x<0)
        {
            System.out.printf("%5.5s %7.4s %14.4s %7.5s\n", x, y1, x, y2); 
        }
        
    }
   }
}