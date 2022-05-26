/**
 * Blank terrain.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Forest extends Terrain
{
    public int trees;
    Forest(int l, int w, int t)
    {
        super(l,w);
        trees = t;
    }
    public int getTrees()
    {
        return trees;
    }
}