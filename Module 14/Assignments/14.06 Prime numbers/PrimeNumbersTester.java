
/**
 * Tester class for the Prime Numbers method.
 * 
 * @author Adam McAvoy
 * @version 3/16/2017
 */
import java.util.Scanner;
public class PrimeNumbersTester
{
    public static void main(String[] args)  
    {
        int remainder, count = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the upper limit of prime numbers: ");
        int upperLimit = in.nextInt();
        
        PrimeNumbers primeNum = new PrimeNumbers(upperLimit);
        int counter = primeNum.calculatePrimes();
        System.out.println("Total primes between 1 and " + upperLimit + " = " + counter);
    }
}