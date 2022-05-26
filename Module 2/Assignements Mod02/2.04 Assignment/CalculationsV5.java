 /**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Adam McAvoy
 * @version 09/23/2016
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        //Clear Text
        System.out.print('\u000C');
        
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 16;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 +" plus "+ iNum2 +" equals " );
        System.out.println( iNum1 + iNum2 );
        System.out.println(dNum1 +" plus "+ dNum2 +" plus "+  dNum3 +" equals ") ; 
        System.out.println( dNum1 + dNum2 + dNum3 );
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 +" minus "+ iNum2 +" minus "+ iNum1 +" equals ");
        System.out.println(iNum3 - iNum2 - iNum1 );
        System.out.println(dNum2 +" minus "+ dNum3 +" equals ");
        System.out.println(dNum2 - dNum3 );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 +" times "+ iNum2 +" equals ");
        System.out.println( iNum1 * iNum2 ); 
        System.out.println(dNum2 +" times "+ dNum3 +" times "+ dNum3 +" equals ");
        System.out.println(dNum2 * dNum3 * dNum3 );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 +" divided by "+ iNum1 +" equals ");
        System.out.println( iNum2 / iNum1 );
        System.out.println(dNum1 +" divided by "+ dNum3 +" equals ");
        System.out.println( dNum1 / dNum3 );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 +" modulus "+ iNum2 +" equals ");
        System.out.println( iNum3 % iNum2 );
        System.out.println(dNum3 +" mudulus "+ dNum2 +" equals");
        System.out.println( dNum3 % dNum2 );
        //System.out.println();
        
        // Personal Arithmetic Expressions
        System.out.println("Personal Arithmetic Expressions");
        System.out.println(dNum1+" plus "+dNum2+" minus "+dNum3+" times "+dNum1+" equals");
        System.out.println(dNum1 + dNum2 - dNum3 * dNum1);
        System.out.println(dNum1+" minus "+dNum2+" divided by "+dNum3+" modulus "+dNum1+" equals");
        System.out.println(dNum1 - dNum2 / dNum3 % dNum1);
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        // 234 minus (234 divided by 6 modulus 12) + 3
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class