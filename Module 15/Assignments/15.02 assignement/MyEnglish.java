public class MyEnglish extends Homework 
{

        public MyEnglish()
        {
                super();
        }
        
        
        public void createAssignment(int p) 
        {
                setPagesRead(p);
                setType("English");
        }
        
        public String toString()
        {
                return getType() + "-  must read " + getPagesRead() + " pages.";
        }
        public void doReading()
        {
            System.out.println("Before Reading: " + toString());
            int x = getPagesRead() - 1;
            System.out.println( getType() + " - Must Read " + x + " pages.");
        }

}