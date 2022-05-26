/**
*This class reads the Ciphertext file, and calculates the frequency of the letters.
*@author Bijan Tajmir
*@version 3/15/2015
*
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
public class CiphertextScanner 
{
	
	private String filename;
	public int counter;

	public CiphertextScanner(String filename)
	{
		this.filename = filename;
    }
	public ArrayList<String> getCipherText() throws IOException
	{
		ArrayList<String> ciphertextMessage = new ArrayList<String>();
		Scanner inFile = new Scanner(new File(filename));
		while(inFile.hasNext())
		{
			ciphertextMessage.add(inFile.next() + " ");
		}
		inFile.close();
		return ciphertextMessage;
	}
    public int[] getFrequency() throws IOException
    {
            int[] frequencies = new int[26];
            ArrayList<String> plaintext = getCipherText();
            
            for(String s : plaintext)
            {
                    for(int i = 0; i < s.length(); i++)
                    {
                    	char letter = Character.toLowerCase(s.charAt(i));
                    	if(letter >= 'a' && letter <= 'z')
                    	{
                    	
                            frequencies[letter - 'a']++;
                    	}
              }
            }
            return frequencies;
    }
	public void printFrequencies() throws IOException
	{
        PrintWriter outputFile = new PrintWriter(new File("ciphertextFreq.txt"));
        int[] frequencies = getFrequency();
        int sum = 0;
        for(int i = 0; i < 26; i++)
        {
                sum += frequencies[i];
        }
        for(int i = 0; i < 26; i++)
        {
                outputFile.print("The frequency of (" + (char)('a' + i)+ ") for Ciphertext is ");
                outputFile.printf("%1.2f%%\n", (100 * (frequencies[i] / (double) sum)));
        }
        outputFile.close();
    }

}