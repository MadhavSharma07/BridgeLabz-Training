public class FirstNegativeNumber {

	public static void main(String[] args) {
		int[] array = {12,4,6,-9,1};  // number array
		boolean foundNegative = false;
		for(int i = 0 ;i<array.length;i++) {
			if(array[i]<0) {  // check   first negative number
				System.out.println(i);  // print first negative number
				foundNegative = true;
				break;
			}
		}
		if(!foundNegative) {
			System.out.println("-1");  // print -1 if number is not found
		}
		
	}
}