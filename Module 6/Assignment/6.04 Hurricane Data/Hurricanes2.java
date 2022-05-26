
/**
 * Hurricane description:
 *
 * @author:
 * @version:
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
        //declare and initialize variables

        int n = 0;
        int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        double [] windSpeed = new double[arrayLength];
        String [] name = new String[arrayLength];
        int [] category = new int[arrayLength];
        int totalCategory = 0;
        int totalPressure = 0;
        int totalSpeed = 0;
        int averageCategory;
        int averagePressure;
        int averageSpeed;
        int category1=0;
        int category2=0;
        int category3=0;
        int category4=0;
        int category5=0;

        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeed[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();

        for(n =0; n < arrayLength; n ++)
        {
            windSpeed[n] = windSpeed[n] * 1.151;
        }
        
        for(n = 0; n < arrayLength; n++)
        {
            if(windSpeed[n] >= 74 && windSpeed[n] < 96)
            {
                category[n] = 1;
            }
            else if(windSpeed[n] >= 96 && windSpeed[n] < 111)
            {
                category[n] = 2;
            }
            else if(windSpeed[n] >= 111 && windSpeed[n] < 130)
            {
                category[n] = 3;
            }
            else if(windSpeed[n] >= 130 && windSpeed[n] < 156)
            {
                category[n] = 4;
            }
            else if(windSpeed[n] >= 157)
            {
                category[n] = 5;
            }
        }
        n = 0;
        while( n < arrayLength)
        {
            totalCategory += category[n];
            totalPressure += pressure[n];
            totalSpeed += (int)windSpeed[n];
            n++;
        }
        averageCategory = totalCategory/arrayLength;
        averagePressure = totalPressure/arrayLength;
        averageSpeed = totalSpeed/arrayLength;
          
        int maxCategory = Integer.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        int maxSpeed = Integer.MIN_VALUE;
        int minCategory = Integer.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int minSpeed = Integer.MAX_VALUE;
        for(n =0; n < arrayLength; n++)
        {
            if(category[n] > maxCategory)
                maxCategory = category[n];
            if(pressure[n] > maxPressure)
               maxPressure = pressure[n];
            if(windSpeed[n] > maxSpeed)
               maxSpeed = (int)windSpeed[n];
            if(category[n] < minCategory)
               minCategory = category[n];
            if(pressure[n] < minPressure)
               minPressure = pressure[n];
            if(windSpeed[n] < minSpeed)
               minSpeed = (int)windSpeed[n];
        }
        
        n = 0;
        while(n < arrayLength)
        {
            if(category[n] == 1)
                category1++;
            if(category[n] == 2)
                category2++;
            if(category[n] == 3)
                category3++;
            if(category[n] == 4)
                category4++;
            if(category[n] == 5)
                category5++;
            n++;
        }

        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for(n = 0; n < arrayLength; n++)
        {
            System.out.printf("%4s       %-8s %9s %14s %20.5s\n", year[n], name[n], category[n], pressure[n], (int)windSpeed[n]); 
        }
        System.out.println("=====================================================================");
        System.out.printf("%7s %21s %14s %20s\n", "Average", averageCategory, averagePressure, averageSpeed);
        System.out.printf("%7s %21s %14s %20s\n", "Maximum", maxCategory, maxPressure, maxSpeed);
        System.out.printf("%7s %21s %14s %20s\n", "Minimun", minCategory, minPressure, minSpeed);
        System.out.println("Number of Category 1: " + category1); 
        System.out.println("Number of Category 2: " + category2); 
        System.out.println("Number of Category 3: " + category3); 
        System.out.println("Number of Category 4: " + category4); 
        System.out.println("Number of Category 5: " + category5); 
    }//end main()
}//end Hurricanes2
