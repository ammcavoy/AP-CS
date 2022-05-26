
public class MyJava extends Homework
{

        public MyJava()
        {
                super();
        }
        
        
        public void createAssignment(int p) 
        {
                setPagesRead(p);
                setType("Java");
        }
        
        public String toString()
        {
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }
        public void doReading()
        {
            System.out.println("Before Reading: " + toString());
            int x = getPagesRead() - 4;
            System.out.println( getType() + " - Must Read " + x + " pages.");
        }
}