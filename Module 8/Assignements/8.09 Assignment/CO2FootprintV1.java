/**
 * 
 * Calculates C02 emissions in terms of pounds and tons given projected annual gas need in gallons, as
 * input by the user.
 * 
 * @author Bijan Tajmir
 * @version 12/17/2014
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class CO2FootprintV1 
{
        public static void main(String[] args) 
        {
                System.out.print('\u000c');              
                double totalGallons = 1288.7 ;
                double tons;
                double pounds;
                CO2FootprintV1Tester calc  = new CO2FootprintV1Tester(totalGallons);
                calc.calcC02Emissions();
                tons = calc.calcTonsOfCO2();
                pounds = calc.calcPoundsOfCO2();
                    
                System.out.println("          CO2 Emissions");  
                System.out.println("Gallons         Tons        Pounds");  
                System.out.println("of Gas        from Gas     from Gas");  
                System.out.println("***********************************");  
          
                System.out.printf("%1.1f%14.2f%15.3f%n",totalGallons,tons,pounds);  
                
                
        }
}