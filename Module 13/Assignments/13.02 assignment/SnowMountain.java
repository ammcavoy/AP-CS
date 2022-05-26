public class SnowMountain extends Mountain
{
    public double temp;
    SnowMountain(int l, int w, int m, double t)
    {
        super(l,w,m);
        temp = t;
    }
    public double getTemp()
    {
        return temp;
    }
}