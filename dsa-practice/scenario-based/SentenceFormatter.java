import java.util.*;

public class SentenceFormatter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to format: ");
        String sentence  = sc.nextLine();      // take sentence from user
        System.out.println("Formatted sentence: "+sentenceFormatter(sentence));

    }

    public static  String sentenceFormatter(String input){
        if(input ==null || input.trim().length()==0){   // if sentence is null,blank or have only spaces then return same input
            return input;
        }

        StringBuilder resultantString  = new StringBuilder();
        boolean capitalized = true;

        String sentence = input.trim().replaceAll("\\s+", " ");  // reduce extra spaces and replace extra spaces with sinle space

        for(int i=0;i<sentence.length();i++){

            char character = sentence.charAt(i);
            if(capitalized && character>='a' && character<='z'){  // first word capital
                resultantString.append((char)(character-32));
                capitalized=false;
            }

            else{
                resultantString.append(character);
            }

            if(character=='.' || character=='?' || character=='!'){  // check punctuation
                capitalized=true;
                if(i+1<sentence.length()){
                    resultantString.append(' ');  // add a sapce after punctuation
                }
            }
        }

        return resultantString.toString().trim();
    }

    
    
}