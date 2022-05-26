
public class MyScience extends Homework 
{

        public MyScience()
        {
                super();
        }
        
        
        public void createAssignment(int p) 
        {
                setPagesRead(p);
                setType("Science");
        }
        
        public String toString()
        {
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }
        public void doReading()
        {
            System.out.println("Before Reading: " + toString());
            int x = getPagesRead() - 3;
            System.out.println( getType() + " - Must Read " + x + " pages.");
        }
}