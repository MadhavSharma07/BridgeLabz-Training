import java.util.*;
public class ConcatenateStringUsingStringBuffer {

	public static void main(String[] args) {
		String array[] = {"Madhav", "is", "a","student","of","GLA","University"};
		StringBuffer stringBuffer =new StringBuffer();  // initialise string buffer
		for(int i=0;i<array.length;i++) {
			stringBuffer.append(array[i]);  // concatenate string
			 if (i < array.length - 1) { 
	                stringBuffer.append(" ");
	            }
		}
		System.out.print("The resultant string is: "+stringBuffer);  // print output
 
	}

}