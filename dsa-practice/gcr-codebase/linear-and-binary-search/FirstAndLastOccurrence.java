public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        if (first == -1 || last == -1) {
            System.out.println("Element not found");  // print output
        } else {
            System.out.println("First Occurrence: " + first);  // print first occurence
            System.out.println("Last Occurrence: " + last);  // last occurence
        } 
    }

    public static int firstOccurrence(int[] arr, int target) {  // method to calculate first occurence
        int left = 0, right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;  // search in left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    public static int lastOccurrence(int[] arr, int target) {  // method to find last occurence
        int left = 0, right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; // search in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    
}