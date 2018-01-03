//задание 1



import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task7 {
    public static void main(String[] args)
    {
        Scanner input = null;
        try {
            input = new Scanner(new File("task.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        TreeMap< String, Integer > statistics = new TreeMap<>();
        
        String max_word = null;
        Integer max_word_count = 0;
        
        while (input.hasNext()) {
            String word = input.useDelimiter("\\s+").next();
            
            Integer count = statistics.get(word);
            if (count == null) {
                count = 1;
                statistics.put(word, 1);//Store - first word
            } else
            {
              //Duplicate word, increase count
              statistics.put(word, count+=1);
            }
            
            //Check max word count
            if(count>max_word_count)
            {
              max_word_count = count;
              max_word = word;
            }                        
        }
        
        System.out.println(statistics);//TreeMap is sorted
        System.out.println("Maximum frequency word: " + max_word);
    }
}
