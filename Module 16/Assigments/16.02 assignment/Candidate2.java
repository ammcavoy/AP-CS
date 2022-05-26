/**
 * Class that holds all of the data for the Candidates, and creates the candidate "object". 
 * V2 - now includes Replacing "algorithms".
 * 
 * @author Adam McAvoy
 * @version 5/11/2017
 */
public class Candidate2
{
    private String name;
    private int numVotes;

    public Candidate2(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName()
    {
        return name;
    }
    
    public int getVotes()
    {
        return numVotes;
    }
    
    public String toString()
    {
        return getName() + " received " + getVotes() + " votes.";
    }
    
    public void replaceName(String n)
    {
        System.out.println("Replacing " + name + " with " + n);
        name = n;
    }
    
    public void replaceVotes(int v)
    {
        System.out.println("Replacing " + name + "'s votes with " + v);
        numVotes = v;
    }
}