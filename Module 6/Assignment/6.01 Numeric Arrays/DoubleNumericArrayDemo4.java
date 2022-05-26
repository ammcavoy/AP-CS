
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class DoubleNumericArrayDemo4
{
    public static void main(String[ ] args) throws IOException
    {
        System.out.print('\u000C');
        int index = 0;
        double [ ] doubleValue = new double[200];
        File fileName = new File("doubles.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNext())
        {
            
            doubleValue[index] = inFile.nextDouble();
            index++;
        }
        
        for(int n = 0; n <= 100; n++)
        {
            System.out.println("double value " + (n + 1) + " is: " 
                                  + dwarfNames[n] + ".  He is in array position " 
                                  + n + ".");
        }  
        
        inFile.close();
        System.out.println("Thank you, all dwarfs are in the array now.");
    }//end of main method
}//end of class 
