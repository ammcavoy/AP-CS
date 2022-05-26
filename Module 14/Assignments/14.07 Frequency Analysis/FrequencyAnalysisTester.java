
/**
*This class prints out the frequencies from the Plaintext and Ciphertext files.
*@author Bijan Tajmir
*@version 3/15/2015
*/
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
public class FrequencyAnalysisTester
{

        public static void main(String[] args) throws IOException
        {
                System.out.print('\u000C');
                FrequencyAnalysis p = new FrequencyAnalysis("plaintext.txt");
                FrequencyAnalysis c = new FrequencyAnalysis("ciphertext.txt");
                //PrintWriter outputFile = new PrintWriter(new File("plaintextFrequency.txt"));

                
                
                int[] plainFrequencies = p.getFrequency();
                int[] cipherFrequencies = c.getFrequency();
                int cipherSum = 0;
                int plainSum = 0;
                for(int i = 0; i < 26; i++)
                {
                        plainSum += plainFrequencies[i];
                        cipherSum += cipherFrequencies[i];
                }
                

                for(int i = 0; i < 26; i++)
                {
                    System.out.print("(plaintext) The frequency of (" + (char)('a' + i)+ ") is ");
                    System.out.printf("%1.2f%%        ", (100 * (plainFrequencies[i] / (double) plainSum)));
                    System.out.print("(ciphertext) The frequency of (" + (char)('a' + i)+ ") is ");
                    System.out.printf("%1.2f%%        ", (100 * (cipherFrequencies[i] / (double) cipherSum)));
                }
                //outputFile.close();
                
                //Scanner inFile = new Scanner(new File("plaintextFrequency.txt"));
                //while(inFile.hasNextLine())
                //{
                //    System.out.println(inFile.nextLine());
                //}
                
                
        }
        
}