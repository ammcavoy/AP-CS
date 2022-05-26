/**
 * music interface 
 * 
 * @author Adam McAvoy
 * @version 5/16/17
 */
public class Music
{
    private String title;
    private int year;
    private String singer;
    public Music(String t, int l, String p)
    {
        title = t;
        year = l; 
        singer = p;
    }
    public void settitle(String q)
    {
        title = q; 
    }
    public String gettitle()
    {
        return title;
    }
    public void setyear(int q)
    {
        year = q;
    }
    public int getyear()
    {
        return year;
    }
    public void setsinger(String q)
    {
        singer = q;
    }
    public String getsinger()
    {
        return singer;
    }
    public String toString()
    {
        return String.format("%-18s\t%-10s\t%-15s",title,year,singer);
    }
    
}