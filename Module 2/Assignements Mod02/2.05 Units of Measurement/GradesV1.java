   /**
   * The purpose of this program is to calculate the average
   * of 4 grades
   * 
   * @author Adam McAvoy 
   * @version 9/28/16
   */
  public class GradesV1
  {
      public static void main(String[] args)
      {
          System.out.print('\u000C');
          
          int test1 = 96;         //test score 1
          int test2 = 78;         //test score 2
          int test3 = 85;         //test score 3
          int test4 = 87;         //test score 4
          double average;         //average of three test scores
          
          //calculate the average grade and print the results
          System.out.println("Test 1: "+test1);
          System.out.println("Test 2: "+test2);
          System.out.println("Test 3: "+test3);
          System.out.println("Test 4: "+test4);
          average = (test1 + test2 + test3 + test4) / 4.0; 
          System.out.println("Average Score: " + average);            
      }//end of main method
 }//end of class
