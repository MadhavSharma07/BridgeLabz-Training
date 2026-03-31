package gcr-codebase.stack-queue-and-hashingfunction;

import java.util.*;
public class TwoSumIndicesUsingHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elelments: ");
		int n= sc.nextInt(); // take number of elements from user
		int numbers[]= new int[n];
		System.out.println("Enter the values of numbers: ");
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();   // take elements from user
		}
		System.out.print("Enter the target value: ");
		int targetSum=sc.nextInt();   // take target sum from user
		HashMap<Integer,Integer> map=new HashMap<>();  // initialise hashmap 
		for(int i=0;i<n;i++) {
			int remaining = targetSum-numbers[i];
			map.put(numbers[i],map.getOrDefault(numbers[i], 0)+1);
		}
		int idx1=-1;
		int idx2=-1;
		boolean flag= false;
		for(int i=0;i<n;i++) {
			int remaining = targetSum-numbers[i];
			if(map.containsKey(remaining)) {
				if(remaining == numbers[i] && map.get(numbers[i])<2) {
					continue;
					
				}
				for(int j=0;j<n;j++) {
					if(remaining==numbers[j] && j!=i) {
						idx1=i;
						idx2=j;
						break;
						
					}
				}
				
				System.out.println("Found pair for target value : "+ numbers[i]+ " , "+(targetSum-numbers[i]));  // print output 
				System.out.println("Found pair indices of target value : "+ idx1+ " , "+idx2);

				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.print("The target sum is not available in this array");
		}
		
		
	}
}
