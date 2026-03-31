

import java.util.*;
public class PairSumUsingHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elelments: ");
		int n= sc.nextInt();  // take number of elements from user
		int number[]= new int[n];
		System.out.print("Enter the target sum value: ");
		int targetSum=sc.nextInt();  // take target sum from user
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();  // initialise hashmap 
		for(int i=0;i<n;i++) {
			int remaining = targetSum-number[i];
			map.put(number[i],map.getOrDefault(number[i], 0)+1);
		}
		
		
		boolean flag= false;
		for(int i=0;i<n;i++) {
			int remaining = targetSum-number[i];
			if(map.containsKey(remaining)) {
				if(remaining == number[i] && map.get(number[i])<2) {
					continue;
					
				}
				System.out.print("Found pair for targetSum value : "+ number[i]+ " , "+(targetSum-number[i]));  // print output
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.print("The targetSum sum is not available in this array");  // print output
		}
		
		
	}
}