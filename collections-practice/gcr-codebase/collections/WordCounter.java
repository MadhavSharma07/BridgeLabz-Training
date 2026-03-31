
import java.util.*;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws Exception {
        File file = new File("file.txt");   // text file
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();  // hash map
        while (sc.hasNext()) {
            String word = sc.next();
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();// remove punctuation and convert to lowercase

            if (word.length() == 0) {
                continue;
            }

            if (map.containsKey(word)) {  // map contains the word then increase its frequency
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}
 
