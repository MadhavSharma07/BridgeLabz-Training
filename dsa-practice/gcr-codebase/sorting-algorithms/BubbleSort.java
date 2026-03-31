package gcr-codebase.sorting-algorithms;
import java.util.*;


public class BubbleSort {

	public static void main(String[] args) {
		int marks[]= {12,3,45,9,0,3,-6,29};  // marks array
		int n=marks.length;  // marks array  length
		System.out.println("Students marks in unsorted order:");
		System.out.println(Arrays.toString(marks));
		System.out.println("\n");
		for(int i=0;i<n;i++) {  // bubble sort
			boolean swapped = false;
			for(int j=0;j<n-1-i;j++) {
				if(marks[j]>marks[j+1]) {
					int temp=marks[j];  // swap numbers
					marks[j]=marks[j+1];
					marks[j+1]=temp;
					swapped=true;
				}
				
			}
			if(!swapped) 
				break;
		}
		System.out.println("Students marks in ascending order : ");  // print output
		System.out.println(Arrays.toString(marks));


	}

}
