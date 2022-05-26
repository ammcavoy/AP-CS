/**
 * arraylist verison
 * 
 * @author Adam McAvoy
 * @version 5/13/2017
 */
import java.util.*;
public class TestCandidate8
{
    public static ArrayList<Candidate4> c = new ArrayList<Candidate4>();
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        
        Candidate4 john = new Candidate4("John Smith", 5000);
        Candidate4 mary = new Candidate4("Mary Miller", 4000);
        Candidate4 michael = new Candidate4("Michael Duffy", 6000);
        Candidate4 tim = new Candidate4("Tim Robinson", 2500);
        Candidate4 joe = new Candidate4("Joe Ashtony", 1800);
        Candidate4 mickey = new Candidate4("Mickey Jones", 3000);
        Candidate4 rebecca = new Candidate4("Rebecca Morgan", 2000);
        Candidate4 kathleen = new Candidate4("Kathleen Turner", 8000);
        Candidate4 tory = new Candidate4("Tory Parker", 500);
        Candidate4 ashton = new Candidate4("Ashton Davis", 10000);
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
       
        System.out.println("Deleted Location 6");
        deleteByLoc(6);
        
        printResults();
        
        System.out.println("Deleted Kathleen Turner");
        deleteByName("Kathleen Turner");
        
        printResults();
    }
    public static double getTotal()
    {
       double sum = 0;
       for(Candidate4 t : c)
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
        for(Candidate4 t : c)
        {
            System.out.printf("%-25s %-20d %5.2f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / sum) * 100);
        }
        System.out.println("Total number of votes in election: " + (int)sum); 
        System.out.println();
    }
    public static void insertPosition(int location, String name, int votes) 
    {          
       c.add(location, new Candidate4(name, votes));
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
        c.add(location, new Candidate4(name, votes));
    }  
    public static void deleteByLoc( int location) 
    {          
       c.remove(location);
    }   
    public static void deleteByName(String find) 
    {
        int location = 0;
        int index;
        for(index = 0; index < c.size(); index++)
        {
          if (c.get(index).getName().equals(find))
          {
              location = index;
              break;
            }
        }
        if (index != c.size())
        {
            c.remove(location);
        }
    } 
}