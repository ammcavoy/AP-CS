/**
 * Movie Interface
 * 
 * @author Adam McAvoy
 * @version 5/13/2017
 */
public class Movie2
{
    private String title;
    private int year;
    private String studio;
    public Movie2(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    public String toString()
    {
        String string = title + ", " + year + ", " + studio;
        return string;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getStudio()
    {
        return studio;
    }
}