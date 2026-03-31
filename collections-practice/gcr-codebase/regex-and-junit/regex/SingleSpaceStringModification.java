
public class SingleSpaceStringModification {
    public static void main(String[] args) {
        String string = "This   is    an  example   with   multiple   spaces.";
        String result = string.replaceAll("\\s+", " ");  // replace multiple spaces to single space
        System.out.println(result);  // print output
    }
}
