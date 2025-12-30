package gcr-codebase.sorting-algorithms;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		int scoreArray[] = {70,98,20,55,47,34,27};  // exam score array
		System.out.println("Before Selection sort:-");
		System.out.println(Arrays.toString(scoreArray)); // print unsorted score array
		int n=scoreArray.length;
		for(int i=0;i<n-1;i++) {  // selection sort
			int min =i;
			for(int j=i+1;j<n;j++) {
				if(scoreArray[j]<scoreArray[min]) {
					min =j;
				}
			}
			int temp = scoreArray[i]; // swap two numbers
			scoreArray[i]=scoreArray[min];
			scoreArray[min]=temp;
		}
		
		System.out.println("After Selection sort:-");  // print output
		System.out.print(Arrays.toString(scoreArray));
	}

}