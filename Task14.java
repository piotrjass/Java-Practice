import java.util.Arrays;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
public class Task14 {
    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
    public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }

}
