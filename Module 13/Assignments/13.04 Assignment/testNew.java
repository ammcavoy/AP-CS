/**
 * Prints dimensions of shapes, and tests whether two shapes are equal or not.
 * 
 * @author Adam McAvy
 * @version 1/3/17
 */
public class testNew
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Rectangle3 r1 = new Rectangle3(1, 2);
        Box3 b1 = new Box3(5, 5, 5);
        Box3 b2 = new Box3(1, 9, 28);
        Cube3 c1 = new Cube3(5);
        
        showEffectBoth(r1);
        showEffectBoth(b1);
        showEffectBoth(b2);
        showEffectBoth(c1);
       
        System.out.print(r1.toString());
        if (r1.equals(b2))
        {
            System.out.print(" is same size as ");
        }
        else
        {
            System.out.print(" is not the same size as ");
        }
        System.out.print(b1.toString());
        System.out.print("\n");
        

        System.out.print(c1.toString());
        if (c1.equals(b1))
        {
            System.out.print(" is same size as ");
        }
        else
        {
            System.out.print(" is not the same size as ");
        }
        System.out.print(b1.toString());
    }


    private static void showEffectBoth(Rectangle3 o)
    {
        System.out.println(o);
        //System.out.println( "Rectangle: " + o  + o.getLength() + " x " + o.getWidth());
    }
}