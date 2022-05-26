/**
 * Box3 Class
 * 
 * @author adam mcavoy
 * @version 1/3/17
 */
public class Box3 extends Rectangle3
{
   
    private int height;

    /**
     * Constructor for objects of class box
     */
    public Box3(int l, int w, int h)
    {

        super(l, w);

        height = h;
    }


    public int getHeight()
    {
        return height;
    }

    public boolean equals(Box3 b)
     {
        if (getLength() == b.getLength())
        {
            if (getWidth() == b.getWidth())
            {
                if(height == b.getHeight())
                {                    
                     return true;
                }
            }
        }
        return false;
     }
     
   public String toString()
   {
        return "Box - " + getLength() + " x " + getWidth() + " x " + getHeight();
   }
}
