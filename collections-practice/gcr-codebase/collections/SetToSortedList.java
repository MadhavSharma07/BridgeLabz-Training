import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();   // hash set
        set.add(5);  // add elements in set 
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList = SetToList(set);  // convert set to list 

        System.out.println(sortedList); // print sorted list
    }

    static List<Integer> SetToList(Set<Integer> set) {  // method to convert set to sorted list 
        List<Integer> list = new ArrayList<>();
        for (Integer value : set) {
            list.add(value); // add elements in list
        }
        Collections.sort(list);  // sort the  list
        return list;
    }
}

