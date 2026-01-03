import java.util.*;
public class CharacterDistinction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string with duplicates : ");
		String string = sc.next();  // take string from user
		StringBuilder stringBuffer = new StringBuilder("");
		HashSet<Character> set = new HashSet<>();
		
		for(char character : string.toCharArray()) {
			if(!set.contains(character)) {  // check distinct character
				stringBuffer.append(character);
				set.add(character);
			}
		}
		
		System.out.println(stringBuffer.toString());  // print output
	
	}
}