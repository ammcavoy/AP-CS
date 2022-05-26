
/**
* This class reads a Plaintext file, and calculates the frequency of the letters.
*@author Bijan Tajmir
*@version 3/13/2015
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FrequencyAnalysis
 {
    
    private String filename;
    public int counter;

    public FrequencyAnalysis(String filename)
    {
        this.filename = filename;    
    }
    public ArrayList<String> getPlainText() throws IOException
    {
        ArrayList<String> plainTextMessage = new ArrayList<String>();
        Scanner inFile = new Scanner(new File(filename));
        while(inFile.hasNext())
        {
            plainTextMessage.add(inFile.next() + " ");
        }
        inFile.close();
        return plainTextMessage;
    }
    public int[] getFrequency() throws IOException
    {
            int[] frequencies = new int[26];
            ArrayList<String> plaintext = getPlainText();
            
            for(String s : plaintext)
            {
                    s = s.toLowerCase();
                    for(int i = 0; i < s.length(); i++){
                        char letter = s.charAt(i);
                        if(letter >= 'a' && letter <= 'z')
                        {
                            frequencies[letter - 'a']++;
                        }
                    }
            }
            return frequencies;
    }
    public void printFrequencies() throws IOException{
        int[] frequencies = getFrequency();
        int sum = 0;
        for(int i = 0; i < 26; i++){
                sum += frequencies[i];
        }
        for(int i = 0; i < 26; i++){
                System.out.print("The frequency of (" + (char)('a' + i)+ ") is ");
                System.out.printf("%1.2f%%\n", (100 * (frequencies[i] / (double) sum)));
        }
      
    }

	

}