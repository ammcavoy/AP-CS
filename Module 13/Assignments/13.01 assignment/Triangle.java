/**
 * rectangle Demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Triangle
{
    // instance variables 
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Constructor for objects of class rectangle
     */
    public Triangle(double a, double b, double c)
    {
        sideA = a;
        sideB = b;
        sideC = c;     
    }

    // return the height
    public double getSideA()
    {
        return sideA;
    }
    public double getSideB()
    {
        return sideB;
    }
    public double getSideC()
    {
        return sideC;
    }
       
}
