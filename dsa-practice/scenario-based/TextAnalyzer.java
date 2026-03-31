import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
         String paragraph = "   Java is powerful and java is popular   ";
        String oldWord = "java";
        String newWord = "Python";

        textAnalyzer(paragraph, oldWord, newWord);
    }


    public static void textAnalyzer(String input , String oldWord, String newWord){

        if(input == null || input.trim().length()==0){
            System.out.println("Enter the valid text");
            return;
        }

        String text = input.trim().replaceAll("\\s+", " "); // reduce extra spaces and replace extra spaces with sinle space
        
        String words[] = text.split(" ");  // words string array 
        int numberOfWords = words.length;   // number of words

        String longestWord = words[0];
        for(int i=1;i<words.length;i++){   // find longest word  logic 1
            if(words[i].length()>longestWord.length()){
                longestWord = words[i];
            }
        }
        // Arrays.sort(words);                       // logic 2  find longest word
        // String longestWord = words[words.length-1];

        StringBuilder resultantText  = new StringBuilder();  // modify oldword to newword logic 1
        for(int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(oldWord)){
                resultantText.append(newWord);
            }
            else{
                resultantText.append(words[i]);
            }
            if(i<words.length-1){
                resultantText.append(" ");
            }
        }

        // String resultantText  = text.replaceAll(oldWord, newWord);    // modify text from oldword to newword  logic 2

        System.out.println("The total number of words is: "+numberOfWords);// print output
        System.out.println("The longest word is: "+longestWord);
        System.out.println("The updated text : "+resultantText.toString());




    }
}
