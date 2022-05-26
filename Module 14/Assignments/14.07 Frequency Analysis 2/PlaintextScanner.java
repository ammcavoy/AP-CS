/**
* This class reads a Plaintext file, and calculates the frequency of the letters.
*@author Adam Mcavoy
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
public class PlaintextScanner 
{
	
	private String filename;
	public int counter;

	public PlaintextScanner(String filename)
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
        PrintWriter outputFile = new PrintWriter(new File("plaintextFreq.txt"));
        int[] frequencies = getFrequency();
        int sum = 0;
        for(int i = 0; i < 26; i++)
        {
                sum += frequencies[i];
        }
        for(int i = 0; i < 26; i++)
        {
                outputFile.print("The frequency of (" + (char)('a' + i)+ ") for Plaintext is ");
                outputFile.printf("%1.2f%%\n", (100 * (frequencies[i] / (double) sum)));
        }
        outputFile.close();
    }

	

}