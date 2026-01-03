public class RotationPoint {
	public static void main(String[] args) {
		int arr[] = {4,4,3,3,0,1,2};  // initialise array
		int left=0;
		int right=arr.length-1;
		while(right!=left) {  // check rotation point
			int mid =(left+right)/2;
			if(arr[mid]>arr[right]) {
				left=mid+1;
			}
			if(arr[mid]<arr[right]) {
				right=mid;
			}
			
		}
		System.out.print( "index of the smallest element is : "+ left);  // print rotation point
		
	}
}
