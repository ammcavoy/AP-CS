
/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 * 
 * @author Adam McAvoy
 * @version 10/5/16
 */
import java.util.Scanner;
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        System.out.print('\u000C');
        //ask the user to enter exchange rate for each country.
        Scanner in;
        in = new Scanner(System.in);
        
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 0.0;          // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        double yenSpent = 99939.75;             // local variable for Japanesse Yen spent
        double yenExchangeRate = 0.0;           // local variable for exchange rate of US Dollar to Yen
        double dollarsSpentInJapan = 0.0;       // local variable for dollars spent in Japan
        double eurosSpent = 624.95;              // local variable for Paris euros spent
        double euroExchangeRate = 0.0;          // local variable for exchange rate of US dollar to Euro
        double dollarsSpentInParis = 0.0;       // local variable for dollars spent in Paris

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
       

        // convertion for Mexican pesos
        System.out.print("Please enter an exchange rate for pesos: ");
        pesoExchangeRate = in.nextDouble();
        dollarsSpentInMexico = pesosSpent * pesoExchangeRate;
        System.out.println();

        // convertion for Japanese yen
        System.out.print("Please enter an exchange rate for yen: ");
        yenExchangeRate = in.nextDouble();
        dollarsSpentInJapan = yenSpent * yenExchangeRate;
        System.out.println();
        
        // convertion for Euros
        System.out.print("Please enter an exchange rate for Euros: ");
        euroExchangeRate = in.nextDouble();
        dollarsSpentInParis = eurosSpent * euroExchangeRate;
        System.out.println();


        //print output to the screen
        remainingUsDollars = startingUsDollars - (dollarsSpentInMexico + dollarsSpentInJapan + dollarsSpentInParis);
        System.out.println("Starting Us Dollars:        " + startingUsDollars);
        System.out.println("US Dollars spent in Mexico: " + dollarsSpentInMexico);
        System.out.println("US Dollars spent in Japan:  " + dollarsSpentInJapan);
        System.out.println("US Dollars spent in Paris:  " + dollarsSpentInParis);
        System.out.println("=====================================================");
        System.out.println("Remaining US Dollars:       " + remainingUsDollars);


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 12; 		//how many items can be purchased
		double fundsRemaining1 = budget1 - (costItem1 * totalItem1);  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = 21; 	//how many items can be purchased
		double fundsRemaining2 = budget2 - (costItem2 * totalItem2);  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

