package dsa-practice.gcr-codebase.runtime-analysis;

public class CompareStringConcatPerformance {
    public static void main(String[] args) {
        int n = 100;
        String string = "string";

 
        String resultantString = "";
        long startStringTime = System.currentTimeMillis();  // string start time
        for (int i = 0; i < n; i++) {
            resultantString += string;
        }
        long endStringTime = System.currentTimeMillis(); // string end time
        System.out.println("String Time: " + (endStringTime - startStringTime) + " ms");  // print string concatenation time

        StringBuilder stringBuilderuilder = new StringBuilder();
        long startBuilderTime = System.currentTimeMillis();  // string builder start time
        for (int i = 0; i < n; i++) {
            stringBuilderuilder.append(string);
        }
        long endBuildertime = System.currentTimeMillis();  // string builder end time
        System.out.println("StringBuilder Time: " + (endBuildertime - startBuilderTime) + " ms"); //print string builder concatenation time

        StringBuffer stringBuffer = new StringBuffer();
        long startBufferTime = System.currentTimeMillis();  // string buffer start time
        for (int i = 0; i < n; i++) {
            stringBuffer.append(string);
        }
        long endBufferTime = System.currentTimeMillis();  // string buffer end time
        System.out.println("StringBuffer Time: " + (endBufferTime - startBufferTime) + " ms");//print string buffer concatenation time
    }
}