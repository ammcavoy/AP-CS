/**
 * rectangle Demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Cube extends Rectangle
{
    // instance variables 
    private int h;

    /**
     * Constructor for objects of class rectangle
     */
    public Cube(int w)
    {
        
        //call super class
        super(w,w);
        int l = w;
        h = w;
    }

    // return the height
    public int getHeight()
    {
        return h;
    }
}
