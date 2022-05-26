/**
 * This class uses recursion to reverse a series of words entered from the keyboard.
 * 
 * ©FLVS 2007 Lesson 12.03 Lab
 * @author B. Jordan
 * @version 08/10/07
 */
import java.util.Scanner;
class RecursiveMethods
{                  
    RecursiveMethods()
    {
    }
    public int function1(int x)
    {
        if(x <= 10)
        
        {
            System.out.println(x + "<= 10, therefore .... f(" + x + ") = -7");
            return -7;
        }   
        else
        {
            System.out.println(x + "> 10, therefore .... f(" + x + ") = f(" + x + " - 4) + 2 = f(" + (x-4) + ") + 2");
            return function1(x-4) + 2;
        }
    }
    public int function2(int x)
    {
        if(x <= 25)
        
        {
            System.out.println(x + "<= 25, therefore .... f(" + x + ") = 20");
            return 20;
        }   
        else
        {
            System.out.println(x + "> 25, therefore .... f(" + x + ") = f((" + x + "/12) + 5) -3 = f(" + ((x/12)+5) + ") - 3");
            return function2((x/12)+5) - 3;
        }
    }
    public int function3(int x)
    {
        if(x > 20)
        
        {
            System.out.println(x + "<= 20, therefore .... f(" + x + ") = -100");
            return -100;
        }   
        else
        {
            System.out.println(x + "> 20, therefore .... f(" + x + ") = f((" + x + "*2) +- 4) - 4 = f(" + ((x*2)-4) + ") - 4");
            return function3(x*2)-4;
        }
    }
}
public class RecursiveMethodTester
{

    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        int x;
        RecursiveMethods test = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x - 4) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -7              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();
        x = 25;
        System.out.println("f(" + x + ") = " + test.function1(x));
        
        
        System.out.println("---------------------------------");
        System.out.println("       f((x/12) + 5) - 3    if x >  25");
        System.out.println("f(x) = ");
        System.out.println("       20                   if x <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        x = 30;
        System.out.println("f(" + x + ") = " + test.function2(x));
        
        
        System.out.println("---------------------------------");
        System.out.println("       f(x*2) - 4    if x >  20");
        System.out.println("f(x) = ");
        System.out.println("       -100          if x <= 20");
        System.out.println("---------------------------------");
        System.out.println();
        x = 500;
        System.out.println("f(" + x + ") = " + test.function3(x));
    }
}


