
/**
 * Write a description of class AnnualFuelUse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnualFuelUseTester
{
    
    public static void main(String[ ] args)
    {
        System.out.print('\u000C');
        
        double [] days = {1,4,8,13};
        double [] startMiles = {45023,45231,45480,45659};
        double [] endMiles = {45231,45480,45659,45961};
        double [] price = {2.95,2.99,3.03,3.01};
        double [] gallonsUsed = {10.00,11.70,9.30,14.90};
        double [] distance = {};
        double [] mpgCalc = {};
        double [] costA = {};
        double totalDistance = 0, distanceMin = 0, distanceMax = 0, MPG = 0, MPGMin = 0, MPGMax = 0, cost = 0, costMin = 0, costMax = 0, gallons = 0, priceMin = 0, priceMax = 0;
        
        AnnualFuelUse calc = new AnnualFuelUse(startMiles,endMiles,price,gallonsUsed);
        
        distance = calc.distance();
        mpgCalc = calc.mpg();
        costA = calc.cost();
        
        System.out.printf("%s%8s%15s%13s%13s%16s%7s%11s%11s\n","Fill Up", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price","Cost");
        System.out.println("=======================================================================================================");
        
        for (int i = 0; i < 4; i++)
        {    
            System.out.printf("%3d%12.2f%14.2f%12.2f%15.2f%12.2f%12.2f%9.2f%13.2f\n",i+1,days[i],startMiles[i],endMiles[i],distance[i],gallonsUsed[i],mpgCalc[i],price[i],gallonsUsed[i] * price[i]);
        }
        
        distanceMin = distance[0];
        distanceMax = distance[0];
        MPGMin = mpgCalc[0];
        MPGMax = mpgCalc[0];
        priceMin = price[0];
        priceMax = price[0];
        
        for (int i = 0; i < 4; i++)
        {
            
            if (distance[i] < distanceMin)
            {
                distanceMin = distance[i];
            }
            
            if (distance[i] > distanceMax)
            {
                distanceMax = distance[i];
            }
            
            if (mpgCalc[i] < MPGMin)
            {
                MPGMin = mpgCalc[i];
            }
            
            if (mpgCalc[i] > MPGMax)
            {
                MPGMax = mpgCalc[i];
            }
            
            if (price[i] < priceMin)
            {
                priceMin = price[i];
            }
            
            if (price[i] > priceMax)
            {
                priceMax = price[i];
            }
            
            totalDistance += distance[i];
            gallons += gallonsUsed[i];
            cost += price[i] * gallonsUsed[i];
        }
        
        System.out.println();
        System.out.printf("%s%47.0f%35.1f%12.2f\n","Minimum",distanceMin,MPGMin,priceMin); 
        System.out.printf("%s%47.0f%35.1f%12.2f\n","Maximum",distanceMax,MPGMax,priceMax);
        System.out.println();
        System.out.printf("%s%48.0f%13.1f%34.2f\n","Totals",totalDistance,gallons,cost);
        System.out.printf("%s%48.0f%13.1f%34.2f\n","Annual",totalDistance * 28,gallons * 28,cost * 28);
        
    }
    
}