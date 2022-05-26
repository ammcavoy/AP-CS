/**
 * This program creates a ASCII Art stick figure.
 * Notice when the escape character had to be used.
 * 
 * ©FLVS 2007
 * @author anonymous 
 * @version 03/01/07
 */
public class Stuff
{
    public static void main(String[ ] args)
    {
        System.out.print('\u000C');
        
        String phrase = "Four score and seven years ago";
        int stringLength = phrase.length();
        System.out.println("Length of String: " + stringLength);
        System.out.println();
	    
	}//end of main method
}//end of class
