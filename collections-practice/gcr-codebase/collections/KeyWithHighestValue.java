import java.util.*;

public class KeyWithHighestValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // hash map
        map.put("A", 10);  // add elements in hash map
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;  // max key
        int maxValue = Integer.MIN_VALUE;  // max value

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {  // find max value
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);   // print max key
    }
}

