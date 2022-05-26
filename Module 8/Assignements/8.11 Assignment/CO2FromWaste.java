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
public class CO2FromWaste
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;
   CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {
       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
   }
   public void calcGrossWasteEmission()
   {
        myEmissions = myNumPeople * 1018;
   }
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }
       if(myPlastic)
       {
           myReduction += (25.6 * myNumPeople);           
       }
       if(myGlass)
       {
           myReduction += (46.6 * myNumPeople);           
       }
       if(myCans)
       {
           myReduction += (165.8 * myNumPeople);         
       }
      }
   public void calcNetWasteReduction()
   {
        myNetEmissions = myEmissions - myReduction;
   }
   public int getNumPeople()
   {
       return myNumPeople;
   }
   public boolean getPaper()
   {
       return myPaper;
   }
   public boolean getGlass()
   {
       return myGlass;
   }
   public boolean getPlastic()
   {
       return myPlastic;
   }
   public boolean getCans()
   {
       return myCans;
   }
   public double getEmissions()
   {
       return myEmissions;
   }
   public double getReduction()
   {
       return myReduction;
   }
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
}

