
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 03/08/07
 */
public class StringPractice
{
	public static void main(String[ ] args)
	{
	    System.out.print('\u000C');
	    
	    //determine the length of the String object called odString
	    String oldString = "Four score and seven years ago";
	    System.out.println("Old string: " + oldString);
	    int stringLength = oldString.length();
	    System.out.println("Number of characters: " + stringLength);
	    System.out.println();
	   	
	    //replace characters within the String object
	    String replaceCharacters = oldString.replace("Four", "4");
	    replaceCharacters = replaceCharacters.replace("seven", "7");
	    System.out.println("Replacement characters: " + replaceCharacters);
	    System.out.println();
	    
	    //split the String object and reassemble in reverse
	    int halfwayPoint = stringLength /2;
	    String firstHalf = oldString.substring(0, halfwayPoint);
	    String secondHalf = oldString.substring(halfwayPoint, stringLength);
	    String splitString = secondHalf + "-" + firstHalf;
	    System.out.println("Split string: " + splitString);
	    System.out.println(); 
	    
	    //remove all the vowels from the string object.
	    String newString1 = oldString.replaceAll("[aeiou]", "");
	    System.out.println("New string: " + newString1);
	    System.out.println();
	    
	    //move first word to the end of the string object
	    int positionOfSpace = oldString.indexOf(' ');
	    String substring1 = oldString.substring(0, positionOfSpace);
	    String substring2 = oldString.substring(positionOfSpace, stringLength);	    
	    String newString2 = substring2 + " " + substring1;
	    System.out.println("New substring: " + newString2);
	    System.out.println();
	    
	    //Pracitice with strings
	    String dateString = "03/07/2007";
	    String newDateString = dateString.replace("/", "-");
	    System.out.println("Input: " + dateString);
	    System.out.println("Output: " + newDateString);
	    
	    String cityString = "Tallahassee, Florida";
	    String newCityString = cityString.replace("a", "A");
	    System.out.println("Input: " + cityString);
	    System.out.println("Output: " + newCityString);
	    
	    String nameString = "Anna Wright";
	    int nameLength = nameString.length();
	    int placeOfSpace = nameString.indexOf(' ');
	    String firstName = nameString.substring(0, placeOfSpace);
	    String lastName = nameString.substring(placeOfSpace, nameLength);
	    String newNameString = lastName + ", " + firstName;
	    System.out.println("Input: " + nameString);
	    System.out.println("Output: " + newNameString);
	    
	}//end of main method
}//end of class
