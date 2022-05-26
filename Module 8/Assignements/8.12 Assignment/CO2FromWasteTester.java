
/**
 * @purpose: Calculate the CO2 from household waste 8.11
 *
 * @author Adam McAvoy
 * @version 12/22/2016
 */
import java.util.ArrayList;
public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       System.out.print('\u000C');
       ArrayList<CO2FootPrint> cO2 = new ArrayList<CO2FootPrint>();
       cO2.add(new CO2FootPrint(104.80, (104.8/1232), 1, 2450.65, 1, true, true, true, true));
       cO2.add(new CO2FootPrint(124, (249.68/2948), 5, 1940.75, 3, true, false, true, false));
       
       

       System.out.println("|          Pounds of CO2           |      Pounds of CO2       |                |");
       System.out.println("|           Emitted From           |      Reduced from        |                |");
       System.out.println("|  Gas    | Electricity |  Waste   |  Recycling |  New Bulbs  |  CO2 FootPrint |");
       System.out.println("|---------|-------------|----------|------------|-------------|----------------|");
       
       CO2FootPrint dataRecord;
       for(int i = 0; i < cO2.size(); i++)
       {
           dataRecord = cO2.get(i);
           dataRecord.calcGasEmissions();
           dataRecord.calcElectricityEmissions();
           dataRecord.calcNewBulbReduction();
           dataRecord.calcWasteEmissions();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetEmissions();

       }
       
       for(int i = 0; i < cO2.size(); i++)
       {
           dataRecord = cO2.get(i);
           System.out.printf("|%8.2f |%10.2f   |%9.2f |%9.2f   |%10.2f   |%10.2f      |\n", dataRecord.getGasEmissions(),
                dataRecord.getElectricityEmissions(), dataRecord.getWasteEmissions(),
                dataRecord.getWasteReduction(), dataRecord.getNewBulbReduction(),
                dataRecord.getNetEmissions());
       }
   }
}