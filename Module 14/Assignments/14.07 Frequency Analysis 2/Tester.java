/**
*This class prints out the frequencies from the Plaintext and Ciphertext files.
*@author Bijan Tajmir
*@version 3/15/2015
*/

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Tester 
{

        public static void main(String[] args) throws IOException
        {
                System.out.print('\u000C');
                PlaintextScanner p = new PlaintextScanner("plaintext.txt");
                CiphertextScanner c = new CiphertextScanner("ciphertext.txt");
                
                
                int[] plainFrequencies = p.getFrequency();
                int[] cipherFrequencies = c.getFrequency();
                int plainSum = 0, cipherSum = 0;
                for(int i = 0; i < 26; i++)
                {
                        plainSum += plainFrequencies[i];
                        cipherSum += cipherFrequencies[i];
                }
                p.printFrequencies();
                Scanner inFile = new Scanner(new File("plaintextFreq.txt"));
                c.printFrequencies();
               Scanner inFile2 = new Scanner(new File("ciphertextFreq.txt"));
               while(inFile.hasNextLine() && inFile.hasNext())
               {
                   String token = inFile.nextLine();
                   String token2 = inFile2.nextLine();
                   System.out.println(token + "\t" + token2);
                }

        }
        
}