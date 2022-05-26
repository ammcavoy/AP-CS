/**
 * arraylist verison
 * 
 * @author Adam McAvoy
 * @version 5/13/2017
 */
import java.util.*;
public class TestCandidate6
{
    public static ArrayList<Candidate3> c = new ArrayList<Candidate3>();
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        Candidate3 john = new Candidate3("John Smith", 5000);
        Candidate3 mary = new Candidate3("Mary Miller", 4000);
        Candidate3 michael = new Candidate3("Michael Duffy", 6000);
        Candidate3 tim = new Candidate3("Tim Robinson", 2500);
        Candidate3 joe = new Candidate3("Joe Ashtony", 1800);
        Candidate3 mickey = new Candidate3("Mickey Jones", 3000);
        Candidate3 rebecca = new Candidate3("Rebecca Morgan", 2000);
        Candidate3 kathleen = new Candidate3("Kathleen Turner", 8000);
        Candidate3 tory = new Candidate3("Tory Parker", 500);
        Candidate3 ashton = new Candidate3("Ashton Davis", 10000);
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
        
        System.out.println("Original Results:");
        
        printResults();
       
        System.out.println("Added Mickey Duck, 14000 votes:");
        insertPosition(5,"Mickey Duck",14000);
        
        printResults();
        
        System.out.println("Added Donald Mouse, 100:");
        insertCandidate("Kathleen Turner","Donald Mouse",100);
        
        printResults();
    }
    public static double getTotal()
    {
       double sum = 0;
       for(Candidate3 t : c)
        {
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
        for(Candidate3 t : c)
        {
            System.out.printf("%-25s %-20d %5.2f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / sum) * 100);
        }
        System.out.println("Total number of votes in election: " + (int)sum); 
        System.out.println();
    }
    public static void insertPosition(int location, String name, int votes) 
    {          
       c.add(location, new Candidate3(name, votes));
    }
    public static void insertCandidate( String find, String name, int votes) 
    {
        int location = 0;
        for(int index = 0; index < c.size(); index++)
        {
          if (c.get(index).getName().equals(find))
          {
               location = index;
          }
        }
        c.add(location, new Candidate3(name, votes));
    }  
}