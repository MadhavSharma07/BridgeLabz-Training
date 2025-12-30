

import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Book Price in unsorted order:");

		int priceArray[]= {21,43,2,4,20,55,44,80,69,38};  // price array
		System.out.print(Arrays.toString(priceArray));
		recursive(priceArray,0,priceArray.length-1);
		System.out.println("\nBook Price in sorted order:");

		System.out.print(Arrays.toString(priceArray));//print output


	}
	public static void recursive(int[] arr, int start,int end) {  // recursive method
		if(start<end) {
			int mid = start+ (end-start)/2;
			recursive(arr,start,mid);
			recursive(arr,mid+1,end);
			
			merge(arr,start,mid,end);
		}
		
	}
	public static void merge(int[] arr, int start,int mid,int end) {  //method to  merge sorted arrays 
		List<Integer> ll = new ArrayList<>();
		int i=start,j=mid+1;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				ll.add(arr[i]);
				i++;
			}
			else {
				ll.add(arr[j]);
				j++;
			}
		}
		while(i<=mid) {
			ll.add(arr[i]);
			i++;
		}
		while(j<=end) {
			ll.add(arr[j]);
			j++;
		}
		
		for(int idx=0;idx<ll.size();idx++) {
			arr[idx+start]=ll.get(idx);
		}
	}

}
