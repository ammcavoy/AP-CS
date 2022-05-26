
/**
 * This program changes words in a string to text messgae abreviations and also some string methods
 * 
 * @author Adam McAvoy
 * @version 10/12/2016
 */
import java.util.Scanner;
public class TextMessageV2
{
   public static void main(String[]args)
   {
      System.out.print('\u000C'); 
      Scanner in;
        in = new Scanner(System.in);
    
       
      //original message
      System.out.println("Please enter a sentance using \"i don't know\", \"be right back\", \"because\", and \"laughing out loud\":");
      String originalString = in.nextLine();
      
      //String originalString = " i don't know if i will be right back or not because right now i am laughing out loud.";
      int stringLength1 = originalString.length();
      System.out.println("Original Message");
      System.out.println("\t" + originalString);
      System.out.println("\tMessage Length: " + stringLength1);
      
      //new message
      String newString1 = originalString.replace("i don't know", "404") ;
      String newString2 = newString1.replace("be right back", "BRB");
      String newString3 = newString2.replace("because", "cuz");
      String newString4 = newString3.replace("laughing out loud", "LOL");
      int stringLength2 = newString4.length();
      System.out.println("New Message");
      System.out.println("\t" + newString4);
      System.out.println("\tMessage Length: " + stringLength2);
      
      //string method samples
      int positionOfB = newString4.indexOf('B'); 
      int firstThird = stringLength2 /3;
      int secondThird = firstThird *2;
      String subString1 = newString4.substring(0, firstThird);
      String subString2 = newString4.substring(secondThird, stringLength2);
      String newString5 = newString4.replaceAll("[rnlste]", "");
      System.out.println("String method samples:");
      System.out.println("\tindexOf \"B\":            " + positionOfB);
      System.out.println("\tsubstring first third: " + subString1);
      System.out.println("\tsubstring last third:   " + subString2);
      System.out.println("\treplaceAll RNLSTE's:   " + newString5);
      
   }
}