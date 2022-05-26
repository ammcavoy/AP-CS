/**
 * test program for square - box
 * 
 * FLVS 2017
 * @auuthor Adam McAvoy
 * @version 2/23/2017
 */
public class TriangleTester
{
    public static void main (String []args)
    {
       System.out.print('\u000C');
       Triangle one = new Triangle(4.0, 5.0, 6.0);
       Equilateral two = new Equilateral(5.0);
       IsoscelesRight three = new IsoscelesRight(1.5);
       
       System.out.println("For Triangle: ");
       System.out.println("Side a: " + one.getSideA());
       System.out.println("Side b: " + one.getSideB());
       System.out.println("Side c: " + one.getSideC());
       
        System.out.println("For Equilateral: ");
       System.out.println("Side a: " + two.getSideA());
       System.out.println("Side b: " + two.getSideB());
       System.out.println("Side c: " + two.getSideC());
       
        System.out.println("For Isosceles: ");
       System.out.println("Side a: " + three.getSideA());
       System.out.println("Side b: " + three.getSideB());
       System.out.println("Side c: " + three.getSideC());
    }
}
      
    