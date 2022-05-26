/**
 *
 * @author Adam McAvoy
 * @version 01/10/2017
 */
public class Catapult
{
   private double [] speed, angle;


   Catapult(double [] s, double [] a)
   {
    speed = s;
    angle = a;
   }
   public double [][] calcDistance()
   {
       double [][]distance = {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},
                              {0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},
                              {0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},
                              {0,0,0,0,0,0,0,0,0,0}};
       for(int col = 0; col < angle.length; col++)
       {      
          for(int row = 0; row < speed.length; row++)
          {
              distance[col][row] = (Math.pow(speed[row], 2) * Math.sin(2 * Math.toRadians(angle[col]))) / 9.8; 
          }
       }
       return distance;
   }
}

