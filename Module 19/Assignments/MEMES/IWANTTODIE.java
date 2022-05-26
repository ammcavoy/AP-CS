
/**
 * Write a description of class IWANTTODIE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IWANTTODIE
{
    public static void main(String[] args)
    {
    mysteryMix("la-la-ls!");
}
public static void mysteryMix(String str)
    {
        int len = str.length();
        if(len>= 3)
        {
            mysteryMix(str.substring(0,len/3));
            System.out.print(str.substring(len/3,2*len/3));
            mysteryMix(str.substring(2*len/3));
        }
    }
}
