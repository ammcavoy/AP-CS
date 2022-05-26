import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class IntNumericArrayDemo4
{
    public static void main(String[ ] args) throws IOException
    {
        System.out.print('\u000C');
        int index = 0;
        int [ ] intValue = new int[200];
        File fileName = new File("ints.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNext())
        {
            
            intValue[index] = inFile.nextInt();
            index++;
        }
        
        for(int n = 0; n <= 100; n++)
        {
            System.out.println("Int number " + (n + 1) + " is: " 
                                  + intValue[n] + ".  It is in array position " 
                                  + n + ".");
        }  
        
        inFile.close();
        System.out.println("Thank you, all Int's are in the array now.");
    }//end of main method
}//end of class 
