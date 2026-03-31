import java.util.*;

public class ElementsFrequency {
    
	public static void main(String[] args) {
		String str[] = {"apple", "banana", "apple", "orange","apple", "banana", "apple", "orange","mango"};  
		Map<String , Integer> map = new HashMap<>();  // hashmap
		System.out.println("\nElement Frequencies:");
		for(int i=0;i<str.length;i++) {
			map.put(str[i],map.getOrDefault(str[i],0)+1);  // store frequency in hashmap
			
		}
		System.out.print(map);  // print frequencies
	}
}
