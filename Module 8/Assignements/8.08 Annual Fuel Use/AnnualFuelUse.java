/**
 * Write a description of class AnnualFuelUseTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnualFuelUse
{
    double [] startMiles;
    double [] endMiles;
    double [] price;
    double [] gallonsUsed;
        
    AnnualFuelUse(double [] s, double [] e, double [] p, double [] g)
    { 
         startMiles = s;
         endMiles = e;
         price = p;
         gallonsUsed = g;
    }
        
    public double [] distance()
    {   
        double distance [] = {0,0,0,0};
        double total = 0;
            
        for (int i = 0; i < distance.length; i++)
        {   
            distance[i] = endMiles[i] - startMiles[i];       
        }
                
        return distance;  
    }
        
    public double [] mpg()
    {        
        double mpg [] = {0,0,0,0};
        double total = 0;
            
        for (int i = 0; i < mpg.length; i++){       
            total = endMiles[i] - startMiles[i];
            mpg[i] = total / gallonsUsed[i];
        }
            
        return mpg;      
    }
        
    public double [] cost()
    {   
        double cost [] = {0,0,0,0};
            
        for (int i = 0; i < cost.length; i++)
        {           
            cost[i] = gallonsUsed[i] * price[i]; 
        }
            
        return cost;    
    }
        
}