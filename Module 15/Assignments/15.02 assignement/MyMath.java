public class MyMath extends Homework 
{

        public MyMath()
        {
                super();
        }
        
        
        public void createAssignment(int p) 
        {
                setPagesRead(p);
                setType("Math");
        }
        
        public String toString()
        {
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }
        public void doReading()
        {
            System.out.println("Before Reading: " + toString());
            int x = getPagesRead() - 2;
            System.out.println( getType() + " - Must Read " + x + " pages.");
        }
}