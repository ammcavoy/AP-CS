
/**
 * The purpose of this program is to calculate your age in minutes
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 06/01/08
 */
import java.util.Scanner;                       
public class Mona
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter you name (Last, First): ");
        String lastName1 = in.next();
        String firstName = in.nextLine();
        String lastName2 = lastName1.replace(",", "");
        String lastInitial = lastName2.substring(0,1);
        
        System.out.print("Please enter you phone number ((xxx) xxx-xxxx) : ");
        String userPhoneNumber = in.nextLine();
        String lastFourDigits = userPhoneNumber.substring(10, 14);
        
        String email = firstName + lastInitial + lastFourDigits + "csamediacenter.com";
        
        System.out.print("Please enter name of overdue book : ");
        String bookName = in.nextLine();
        
        System.out.print("Please enter date book was check out (mm/dd/yyyy) : ");
        String checkOutDate1 = in.nextLine();
        String checkOutDate2 = checkOutDate1.replace("/", "-");
        
        System.out.print("Please enter days past overdue : ");
        String daysOverdueString = in.nextLine();
        int daysOverdueInt = Integer.parseInt(daysOverdueString);
        
        System.out.print("Please enter daily fine (0.00) : $");
        String dailyFineString = in.nextLine();
        double dailyFineDouble = Double.parseDouble(dailyFineString);
        
        double fine = (double)daysOverdueInt * dailyFineDouble; 
        
        System.out.println("-----------Text for email message--------------\n\n");
        System.out.println("To: " + firstName + " " + lastName2 + " (" + email + ")\n");
        System.out.println("From: Mona (mona@csamediacenter.com) \n");
        System.out.println("Subject: Overdue Book Notice");
        System.out.println("===============================================================");
        System.out.println(bookName + " was checked out on: " + checkOutDate2);
        System.out.println("This book is currently " + daysOverdueString + " days(s) late");
        System.out.println("Your fine has accumilated to: $" + fine + " dollar(s)");
        
    }
    }
