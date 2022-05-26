
/**
 * rectangle Demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box extends Rectangle
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Box(int l, int w, int h)
	{
		//call super class
	    super(1,w);
	    //initiatise instance variables 
	    height = h;
	}

	// return the height
	public int getHeight()
	{
	    return height;
	}
}
