/**
 * Prints the Candidate data, and runs the Replacement Methods.
 * 
 * @author Adam McAvoy
 * @version 5/11/2017
 */
import java.util.ArrayList;
public class TestCandidate2
{
    public static ArrayList<Candidate2> c = new ArrayList<Candidate2>();
    public static void main(String[] args)
    {
    System.out.print('\u000c');
    
    
    Candidate2 john = new Candidate2("John Smith", 5000);
    Candidate2 mary = new Candidate2("Mary Miller", 4000);
    Candidate2 michael = new Candidate2("Michael Duffy", 6000);
    Candidate2 tim = new Candidate2("Tim Robinson", 2500);
    Candidate2 joe = new Candidate2("Joe Ashtony", 1800);
    Candidate2 mickey = new Candidate2("Mickey Jones", 3000);
    Candidate2 rebecca = new Candidate2("Rebecca Morgan", 2000);    
    Candidate2 kathleen = new Candidate2("Kathleen Turner", 8000);
    Candidate2 tory = new Candidate2("Tory Parker", 500);
    Candidate2 ashton = new Candidate2("Ashton Davis", 10000);
    c.add(john);
    c.add(mary);
    c.add(michael);
    c.add(tim);
    c.add(joe);
    c.add(mickey);
    c.add(rebecca);
    c.add(kathleen);
    c.add(tory);
    c.add(ashton);
    
    printResults();
    
    
    
    michael.replaceName("John Elmos");
    mickey.replaceVotes(2500);
    kathleen.replaceName("John Kennedy");
    kathleen.replaceVotes(8500);
    
    printResults();
    
    
}
 public static double getTotal()
   {
       double sum = 0;
       //for(int i = 0; i < c.size(); i++)
       for(Candidate2 t : c)
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
        
        double sum = getTotal();  
        
        System.out.println("Candidate            Votes Received       % of Total Votes");
        for(Candidate2 t : c)
        {
            System.out.printf("%-25s %-20d %5.2f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / sum) * 100);
        }
        System.out.println("Total number of votes in election: " + (int)sum); 
        System.out.println();
   }

}