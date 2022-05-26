
/**
 * 
 * Calculates C02 emissions 
 * 
 * 
 * @author Adam McAvoy
 * @version 12/19/2016
 */
public class CO2FootprintV1Tester
{
		private double gallonsOfGas = 0;
		private double tonsOfCO2 = 0;
		private double metricTonsOfCO2 = 0;
		private double poundsOfCO2 = 0;
		private double mathCalc = (8.78 * Math.pow(10, -3));
		
		CO2FootprintV1Tester(double gallons)
		{
			gallonsOfGas = gallons;
		}
		
		public void calcC02Emissions()
		{
		    metricTonsOfCO2 = mathCalc * gallonsOfGas;
		    tonsOfCO2 = metricTonsOfCO2 * 1.10231;
		    poundsOfCO2 = tonsOfCO2 * 2000;
		}

		public double calcTonsOfCO2()
		{
		    return tonsOfCO2;
		}

		public double calcPoundsOfCO2()
		{
		    return poundsOfCO2;
		}
}