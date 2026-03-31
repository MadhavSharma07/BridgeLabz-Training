package gcr-codebase.sorting-algorithms;

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("EmployeeId in unsorted order:");

		int employeeIdArray[]= {2,43,72,1,21,56,45,60,69,39}; // employee id array
		System.out.print(Arrays.toString(employeeIdArray));  // print unsorted employee id array

		int n=employeeIdArray.length;  // employee id array length
		for(int i=0;i<n;i++) {
			int j=i;
			while(j>0 && employeeIdArray[j-1]>employeeIdArray[j]) {  // first element is greater than second
				int temp =employeeIdArray[j-1];  // swap two numbers
				employeeIdArray[j-1] =employeeIdArray[j];
				employeeIdArray[j]=temp;
				j--;
			}
		}
		System.out.println("\nEmployeeId  in ascending order : ");  // print output

		System.out.print(Arrays.toString(employeeIdArray));

	}

}