import java.util.ArrayList;
public class TextFile 
{ 

    private String fileName;
    private ArrayList<String> words;
            
        
    public int fileSize()       
        {
            return words.size();
        }
      
           
       
        public void deleteWords(int index, int numWords)               
        {
            if (0 <= index && index <= fileSize()) 
            {
                words.remove(numWords);
            }
        }
        
       
        
        public void addWords(int index, String[] newWords)
        
        
        {
        if(0<= index && index <= fileSize())
        {
            words[index] = newWords;
        }
        
        }
        
        

        
        
        } 

       
        
