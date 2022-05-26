
/**
 * Prints the Candidate data.
 * 
 * @author Adam McAvoy
 * @version 5/13/17
 */
import java.util.ArrayList;
public class TestCandidate
{
   public static ArrayList<Candidate> c = new ArrayList<Candidate>();
    public static void main(String[] args)
    {
        System.out.print('\u000C');
    
       
        Candidate john = new Candidate("John Smith", 5000);
        Candidate mary = new Candidate("Mary Miller", 4000);
        Candidate michael = new Candidate("Michael Duffy", 6000);
        Candidate tim = new Candidate("Tim Robinson", 2500);
        Candidate joe = new Candidate("Joe Ashtony", 1800);
        c.add(john);
        c.add(mary);
        c.add(michael);
        c.add(tim);
        c.add(joe);
       
        printResults();
    }
   public static double getTotal()
   {
       double sum = 0;
       //for(int i = 0; i < c.size(); i++)
       for(Candidate t : c)
        {
            //Candidate t = c[i];
            sum += t.getVotes();
        }
        return sum;
   }
   public static void printResults()
   {
        System.out.println("Results Per Candidate:");
        System.out.println("______________________");
        System.out.println();
        
        //for(int i = 0; i < c.size(); i++)
        for(Candidate t : c)
        {
            //Candidate t = c[i];
            System.out.println(t.toString());
        }
        
        double sum = getTotal();  
        
        System.out.println("Candidate            Votes Received       % of Total Votes");
        for(Candidate t : c)
        {
            System.out.printf("%-25s %-20d %5.2f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / sum) * 100);
        }
        System.out.println("Total number of votes in election: " + (int)sum); 
   }
   
   
}