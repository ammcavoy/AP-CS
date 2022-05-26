/**
 * test program for square - box
 * 
 * FLVS 2017
 * @auuthor Adam McAvoy
 * @version 2/23/2017
 */
public class Test
{
    public static void main (String []args)
    {
       System.out.print('\u000C');
       Rectangle one = new Rectangle(2, 4);
       Box two = new Box(4,10,4);
       Cube three = new Cube(4);
       
       System.out.println("For Rectangle:");
       System.out.println("The length is " + one.getLength());
       System.out.println("The width is " + one.getWidth());
        System.out.println("For Box:");
       System.out.println("The length is " + two.getLength());
       System.out.println("The width is " + two.getWidth());
       System.out.println("The height is " + two.getHeight());
        System.out.println("For Cube:");
       System.out.println("The length is " + three.getLength());
       System.out.println("The width is " + three.getWidth());
       System.out.println("The height is " + three.getHeight());
    }
}
       