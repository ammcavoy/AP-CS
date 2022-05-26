/**
 * 
 * 
 * @author Adam McAvoy
 * @version 5/13/2017
 */
import java.util.*;
public class TestStudent
{
    public static ArrayList<Student> myClass = new ArrayList<Student>();
    public static void main(String[] args)
    {
        System.out.println("Starting Gradebook:");
        System.out.println();

        Student mark = new Student("Mark Kennedy",70,80,90,100,90);
        Student max = new Student("Max Gerard",80,85,90,85,80);
        Student jean = new Student("Jean Smith",50,79,89,99,100);
        Student betty = new Student("Betty Farm",85,80,85,88,89);
        Student dilbert = new Student("Dilbert Gamma",70,70,90,70,80);
        myClass.add(mark);
        myClass.add(max);
        myClass.add(jean);
        myClass.add(betty);
        myClass.add(dilbert);
        
        printBook();

        System.out.println("\nChanging Betty's name to Betty Boop:\n");
        betty.replaceName("Betty Boop");

        printBook();

        System.out.println("\nChanging Jean's quiz 1 score to 80:\n");
        jean.replaceQuiz(1, 80);
        
        printBook();
        

        System.out.println("\nReplacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:\n");
        dilbert.replaceStudent("Mike Kappa",80,80,80,90,90);

        printBook();

        System.out.println("\nInserting Lily Mu: 85, 95, 70, 0, 100 before Betty:\n");
        insertStudent("Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);

        printBook();

        System.out.println("\nDeleting Max Gerard:\n");
        deleteStudent("Max Gerard");

        printBook();
    }
    public static void printBook()
    {
        System.out.printf("%-15s %5s %5s %5s %5s %5s \n","Student name","Q1","Q2","Q3","Q4","Q5");
        System.out.println("-------------------------------------------");
        for(Student t : myClass)
        {
            System.out.print(t.toString());
        }
    }
    public static void insertStudent(String find, String newname, int q1, int q2, int q3, int q4, int q5)
    {
        int location = 0;
        for(int i = 0; i < myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                location = i;
                break;
            }
        }
        myClass.add(location, new Student(newname, q1, q2, q3, q4, q5));
    }
    public static void deleteStudent(String find)
    {
        int location = 0;
        int i;
        for(i = 0;i < myClass.size();i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                location = i;
                break;
            }
        }
        if(i != myClass.size())
        {
            myClass.remove(location);
        }
    }
}
  
