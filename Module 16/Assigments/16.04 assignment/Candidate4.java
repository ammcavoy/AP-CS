/**
 * Candidate interface.
 * 
 * @author Adam McAvoy
 *@version 5/13/2017
 */
public class Candidate4
{
    private String name;
    private int numVotes;
    public Candidate4(String name, int numVotes)
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
        name = n;
    }
    public void replaceVotes(int v)
    {
        numVotes = v;
    }
}