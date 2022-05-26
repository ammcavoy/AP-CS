
/**
 * This program uses String objects to print my ASCII art 
 *
 * Â©FLVS 2007
 * @author Adam McAvoy
 * @version 10/11/2016
 */
public class SurpriseV1
{
    public static void main(String [ ] args)
    {
        //clear Text
        System.out.print('\u000C');
        
        //local variables
        String row1 = "   ***     ***      ";
        String row2 = "\n  *   *   *   *     ";
        String row3 = "\n *     * *     *    ";
        String row4 = "\n *     * *     *    ";
        String row5 = "\n  *   *   *   *     ";
        String row6 = "\n   ***     ***      ";
        String row7 = "\n*                *  "; 
        String row8 = "\n *              *   ";
        String row9 = "\n  *            *    "; 
       String row10 = "\n   ************     ";
        //print ASCII art
        System.out.print(row1);
        System.out.print(row2);
        System.out.print(row3);
        System.out.print(row4);
        System.out.print(row5);
        System.out.print(row6);
        System.out.print(row7);
        System.out.print(row8);
        System.out.print(row9);
        System.out.print(row10);
    }
} 
