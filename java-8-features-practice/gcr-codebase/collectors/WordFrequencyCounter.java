package collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String paragraph =
	                "java is powerful and java is easy and powerful";

	        Map<String, Integer> wordCount =
	                Arrays.stream(paragraph.toLowerCase().split("\\s+"))
	                        .collect(Collectors.toMap(
	                                word -> word,      // key
	                                word -> 1,         // initial value
	                                Integer::sum       // merge function
	                        ));

	        System.out.println(wordCount);
	    }

}

