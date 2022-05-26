/**
 * Write a description of class hjdsa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CeasarShiftTester
{
    public static void main(String[] args) throws IOException
    { 
        
        System.out.println('\u000C');
        Scanner in = new Scanner(System.in);
        String type = "";
        int shift;
        String originalMessage;
        CeasarShift c = new CeasarShift();
        
        while (!type.equalsIgnoreCase("q"))
        {
            System.out.println("[E] encryption of a message");
            System.out.println("[D] decryption of a message");
            System.out.println("[Q] quit");
            System.out.print("please enter the letter corresponding to the activity you wish to carry out: ");
            type = in.next();
            
            if(type.equalsIgnoreCase("e"))
            {
                System.out.print("please enter the shift key (1-25): ");
                shift = in.nextInt();
                in.nextLine();
                System.out.println("please enter the message you would like to encrypt");
                originalMessage = in.nextLine();
                
                System.out.println("your encryped message is " + c.encrypt(originalMessage, shift));
            }
            else if(type.equalsIgnoreCase("d"))
            {
               
                
                 System.out.print("please enter the shift key (1-25): ");
                shift = in.nextInt();
                in.nextLine();
                System.out.println("please enter the message you would like to decrypt");
                originalMessage = in.nextLine();
                System.out.println("your decryped message is " + c.decrypt(originalMessage, shift));
            }
            else if(type.equalsIgnoreCase("q"))
            {
                System.out.println("thank you for running this program");
            }
        }
         
    }
}

