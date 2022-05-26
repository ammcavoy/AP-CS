/**
 * This class instantiates CO2FromWaste(8.11) objects with 8 private instance variables.
 * It contains three mutator methods to calculate the pounds of CO2: in total emissions,
 * emission reductions, and net emissions.  It contains getter methods for each private
 * instance variables.  Private instance variables include myNumPeople, myPaper, myPlastic,
 * myGlass, myCans, myEmissions, myReduction, and myNetEmissions.
 *
 * @author Adam McAvoy
 * @version 12/22/2016
 */
public class CO2FootPrint
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double averageBill, averagePrice, bulbsReplaced,  gallonsUsed, metricTonsOfCO2, tonsOfCO2, gasEmissions, electricityEmissions, newBulbReduction, wasteEmissions, wasteReduction, netEmissions;
   double emissionsFactor = 1.37;
   CO2FootPrint(double bill, double price, double bulbs, double gallons, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {
       gallonsUsed = gallons;
       gasEmissions = 0.0;
       
       averageBill = bill;
       averagePrice = price;
       bulbsReplaced = bulbs;
       electricityEmissions = 0.0;
       newBulbReduction = 0.0;
                       
       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       wasteEmissions = 0.0;
       wasteReduction = 0.0;
       
       netEmissions = 0.0;
   }
   public void calcGasEmissions()
   {
       metricTonsOfCO2 = (8.78 * Math.pow(10, -3)) * gallonsUsed;
       tonsOfCO2 = metricTonsOfCO2 * 1.10231;
       gasEmissions = tonsOfCO2 * 2000;
   }
   public void calcElectricityEmissions()
   {
       electricityEmissions = (averageBill / averagePrice) * (emissionsFactor * 12);
   }
   public void calcNewBulbReduction()
   {
       newBulbReduction = bulbsReplaced * emissionsFactor * 73;
   }
   public void calcWasteEmissions()
   {
        wasteEmissions = myNumPeople * 1018;
   }
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           wasteReduction += (184.0 * myNumPeople);
       }
       if(myPlastic)
       {
           wasteReduction += (25.6 * myNumPeople);           
       }
       if(myGlass)
       {
           wasteReduction += (46.6 * myNumPeople);           
       }
       if(myCans)
       {
           wasteReduction += (165.8 * myNumPeople);         
       }
      }
   public void calcNetEmissions()
   {
        netEmissions = (gasEmissions + electricityEmissions+ wasteEmissions) - (newBulbReduction + wasteReduction);
   }
   public double getGasEmissions()
   {
       return gasEmissions;
   }
   public double getElectricityEmissions()
   {
       return electricityEmissions;
   }
   public double getWasteEmissions()
   {
       return wasteEmissions;
   }
   public double getWasteReduction()
   {
       return wasteReduction;
   }
   public double getNewBulbReduction()
   {
       return newBulbReduction;
   }
   public double getNetEmissions()
   {
       return netEmissions;
   }
}

