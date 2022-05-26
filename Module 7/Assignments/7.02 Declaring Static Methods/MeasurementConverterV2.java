
/**
 * converts measurements 
 * 
 * @author Adam McAvoy 
 * @version 12/5/2016
 */
public class MeasurementConverterV2
{

    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 1.61;  
    } 
    
    public static double convertKilometersToMiles(double km)
    {
        return km / 1.61;    
    } 
    
    public static double convertPoundsToKilograms(double lbs)
    {
        return lbs * 0.453592;
    } 
    
    public static double convertKilogramsToPounds(double kg)
    {
        return kg * 2.20462; 
    } 
    
    public static double convertGallonsToLiters(double gl)
    {
        return gl * 3.78541;
    }
    
    public static double convertLitersToGallons(double li)
    {
        return li / 3.78541;
    }
    
        
    public static void main(String[ ] args)
    {
        System.out.print('\u000C');
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    
        double feet = 6230;
        double miles = convertFeetToMiles(feet);           
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lbs. = %7.1f kg. %n", pounds, kilograms);
         
       
        kilograms = 98;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg. = %7.1f lbs. %n", kilograms, pounds);
        
        double gallons = 55;
        double liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f gl. = %7.1f li. %n", gallons, liters);
        
        liters = 2;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f li. = %7.1f gl. %n", liters, gallons);          
    }//end of main method
	
}//end of class


