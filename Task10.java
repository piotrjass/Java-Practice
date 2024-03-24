import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java
public class Task10 {
    List<String> returnSentence = new ArrayList<>();
    public static String encode(String word){

        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Integer index = letters.get(c);
            if (index == null) {
                // First occurrence
                result.append("(");
                letters.put(c, i);
            } else if (index >= 0) {
                // 2nd occurrence, replace first instance, and set entry to -1
                result.replace(index, index + 1, ")");
                result.append(")");
                letters.put(c, -1);
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }

}
