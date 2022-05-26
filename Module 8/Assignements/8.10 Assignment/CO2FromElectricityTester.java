/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author Adam McAvoy
 * @version 12/21/2016
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
       System.out.print('\u000C');
       CO2FromElectricity CO2 = new CO2FromElectricity();

       double [] monthlyBill = {209.60, 249.68, 222.59};
       double [] monthlyPrice = {(209.60 / 2464), (249.68 / 2948), (222.59 / 2621)};
        

       double averageBill = CO2.calcAverageBill(monthlyBill);
       double averagePrice = CO2.calcAveragePrice(monthlyPrice);
       double emissions = CO2.calcElectricityCO2(averageBill, averagePrice);

       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", averageBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", averagePrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}
