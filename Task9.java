import java.util.HashMap;

// url https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
public class Task9 {

    public static int duplicateCount2(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) +1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }

    // but its O^2 complexity
    public static int duplicateCount(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }
}
