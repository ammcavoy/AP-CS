/**
 * Annual Climate description:
 *
 * @author:
 * @version:
 *
 */

import java.util.Scanner;
class AnnualClimate
{

    public static void main (String [ ] args)
    {
        System.out.print('\u000C');

        //Declare and intialize variables - programmer to provide initial values
        Scanner in = new Scanner(System.in);
        String city = "West Palm Beach";
        String state = "Florida";

        String month [] ={"Jan", "Feb" };
        double temperature [] ={66.2, 67.2, 70.6, 73.8, 78.2, 81.2, 82.5, 82.8, 81.7, 78.1, 73.1, 68.3};        //initialize with Fahrenheit values
        double precipitation [] ={3.8, 2.6, 3.7, 3.6, 5.4, 7.6, 6.0, 6.7, 8.1, 5.5, 5.6, 3.1};  //initialize with inches values
        String months [] = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "jun.", "Jul.", "Aug.", "Sep,", "Oct.", "Nov.", "Dec."};  
        double temp = 0;
        double precip = 0;
        double tempAverage = 0;
               
        String tempLabel = "F";   //initialize to F
        String precipLabel = "in"; //initialize to cm


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        // remember 5/9 = 0, 5.0/9 = .5555

        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel="(C)";
            for( int index = 0; index < temperature.length; index++)
            {
                temperature[index] = (temperature[index] - 32.0)/1.8;
            }

        }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("c"))
        {
            precipLabel="(cm)";
            for( int index = 0; index < precipitation.length; index++)
            {
                precipitation[index] = (precipitation[index] * 2.54);
            }

        }

        //OUTPUT - print table using printf to format and align data

        System.out.println();
        System.out.println("Climate Data");
        System.out.println("Location: " + city +", " + state);
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("***************************************************");
        System.out.println();
        for( int index = 0; index < months.length; index++)
        {
            System.out.printf("%-5s %18.4s %18.4s\n", months[index],temperature[index],precipitation[index]);
            temp = temp + temperature[index];
            precip = precip + precipitation[index];
            
        }
       
        tempAverage = temp/12;
        
            
        System.out.printf("%18s %5.4s %14s %5.5s", "Average:", tempAverage, "Annual:", precip);  



    }//end main
}//end Annual Climate
