import java.util.*;

public class CheckEqualSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); // hash set1
        Set<Integer> set2 = new HashSet<>();// hash set2
        set1.add(1); // add elements in set 1
        set1.add(2);
        set1.add(3);
        set2.add(3);  // add elements in set2
        set2.add(2);
        set2.add(1);
        boolean equalSet = checkEquality(set1, set2);

        System.out.println("Are both sets equal? " + equalSet);  // print output 
    }

    static boolean checkEquality(Set<Integer> set1, Set<Integer> set2) {// method to check equality of set1 and set2

        if (set1.size() != set2.size()) {
            return false;
        }

        for (Integer i : set1) {
            if (!set2.contains(i)) {
                return false;
            }
        }

        return true;
    }
}
