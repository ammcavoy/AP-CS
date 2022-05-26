
/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author Adam McAvoy  
 * @version 12/21/2016
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   CO2FromElectricity()
   {
    //default constructor to be used
   }

   public double calcAverageBill(double [] monthlyBill)
   {
       double totalBill = 0;
       int n;
       for( n = 0; n < monthlyBill.length; n++)
       {
           totalBill += monthlyBill[n];
       }
       return totalBill/(n);
   }

   public double calcAveragePrice (double [] monthlyPrice)
   {
       double totalPrice = 0;
       int n;
        for(n = 0; n < monthlyPrice.length; n++)
       {
           totalPrice += monthlyPrice[n];
       }
       return totalPrice/(n);
   }

   public double calcElectricityCO2 (double averageBill, double averagePrice)
   {
        double emissionsFactor = 1.37;
        return (averageBill/averagePrice)*(emissionsFactor*12);
   }
}

