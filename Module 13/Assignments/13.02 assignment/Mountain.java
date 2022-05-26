/**
 * Blank terrain.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Mountain extends Terrain 
{
    public int mountains;
    Mountain(int l, int w, int m)
    {
        super(l, w);
        mountains = m;
    }
    public int getMountains()
    {
        return mountains;        
    }
}
