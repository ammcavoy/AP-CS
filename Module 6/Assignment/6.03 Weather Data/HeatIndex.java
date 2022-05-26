/**
 * Heat Index description:
 *
 * @author Adam McAvoy
 * @version 11/29/2016
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        System.out.print('\u000C');
        
        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];

        int n = 0; 
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
           
            n++;
        }
        inFileTemp.close();
        
        n = 0; 
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                
                n++;
        }
        inFileHumid.close();

        double t = 0.0;
        int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) 
            {
                t = temperature[n];
                h = humidity[n];

                hI[n] = -42.379 + (2.04901523*t) + (10.14333127*h) - (0.22475541*t*h) - (.00683783*t*t) - (.05481717*h*h) + (.00122874*t*t*h) + (.00085282*t*h*h) - (.00000199*t*t*h*h);    
            }
            else  
            {
                hI[n] = temperature[n];
            }
        }

        double tempSum = 0.0;
        double humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
            tempSum += temperature[n];
        }
        double tempAverage = tempSum/temperature.length;
        for(n = 0; n < humidity.length; n++)
        {
              humidSum += humidity[n];
        }
        double humidAverage = humidSum/humidity.length;
        for(n = 0; n < hI.length; n++)
        {
            hISum += hI[n];
        }
        double hIAverage = hISum/hI.length;
        
        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();

        System.out.println("          Months ");
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("   %4.3s", m);
        }

        System.out.println("   Avg");
        System.out.println("**********************************************************************************************************");
        System.out.print("Temp (F)    ");  
        for(double q : temperature)
        {
            System.out.printf("   %4.4s", q);
        }
        System.out.printf("%6.4s\n", tempAverage);

        System.out.print("Humidity (%)");
        for(int g : humidity)
        {
            System.out.printf("   %4.2s", g);
        }
        System.out.printf("%6.4s\n", humidAverage);

        System.out.print("HI (F)      ");
        for(double p : hI)
        {
            System.out.printf("   %4.4s", p);
        }

        System.out.printf("%6.4s\n", hIAverage);
    } //end main()
}//end HeatIndex
