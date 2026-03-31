import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array.")
        int  n = sc.nextInt();                  // size of array from user
        int arr[] = new int[n];
        System.out.println("Enter the elements in sorted way.");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();                 // loop to enter the elements in array.
        }
        System.out.println("Enter the searching element  .");
        int target = sc.nextInt();   //enter search element
        int start=0;
        int end = arr.length-1;
        while(start<end){                         // loop to find element.
            int mid = (start+end)/2;
            if(target==arr[mid]){
                System.out.println(target);
            }
            if(arr[mid]<target){
                end =mid-1;
            }
            if(arr[mid]>target){
                start=mid+1;
            }
        }

    }
}
