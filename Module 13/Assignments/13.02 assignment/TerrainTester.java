/**
 * test program for square - box
 * 
 * FLVS 2017
 * @auuthor Adam McAvoy
 * @version 2/23/2017
 */
public class TerrainTester
{
    public static void main (String []args)
    {
       System.out.print('\u000C');
       Forest one = new Forest(100, 200, 100);
       Mountain two = new Mountain(300, 400, 25);
       SnowMountain three = new SnowMountain(500, 600, 15, 10.0);
       
       System.out.println("Forest " +one.terrainSize() + " and has " + one.getTrees() + " Trees");
       System.out.println("Mountain " + two.terrainSize() + " and has " + two.getMountains() + " Mountains");
       System.out.println("Snow Mountain " + three.terrainSize() + " and has a temperature of " + three.getTemp() + " C and " + three.getMountains() + " Mountains");

    }
}
