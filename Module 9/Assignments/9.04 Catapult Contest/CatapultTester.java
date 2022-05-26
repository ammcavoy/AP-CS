/**
 *  
 *
 * @author Adam McAvoy
 * @version 01/10/2017
 */
import java.util.ArrayList;
public class CatapultTester
{
   public static void main(String[] args)
   {
       System.out.print('\u000C');
       
       double [] speed = {20,25,30,35,40,45,50,55,60,65};
       double [] angle = {25,30,35,40,45,50,55,60,65,70};     
     
       Catapult dist = new Catapult(speed, angle);
       
       double [][] distance = dist.calcDistance();
       
       System.out.print("MPH  ");
       for(int i = 0; i < angle.length; i++)
       {
           System.out.printf("%10s", angle[i] + "deg");           
       }
       
       System.out.println("\n=========================================================================================================");
       for(int i = 0; i < speed.length; i++)
       {
           System.out.printf("%2s", speed[i]);
           for(int n = 0; n < angle.length; n++)
           {
               System.out.printf("%10.1f", distance[n][i]);
           }
           System.out.println();
       }

       
       

      
       }
   }
