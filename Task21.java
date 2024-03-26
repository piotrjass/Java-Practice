import java.util.HashMap;

// url https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/train/java
public class Task21 {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("streSS"));
    }
    public static String firstNonRepeatingLetter(String s){
        if(s.length()==1){
            return s;
        }
        HashMap<Character, Integer> occurs = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            occurs.put(temp, occurs.getOrDefault(temp,0)+1);
            if(occurs.get(temp)>1){
                return String.valueOf(temp);
            }
        }
        return "";
    }

    // the correct solution:

    public static String firstNonRepeatingLetter2(String s){
        char ch;
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ch = Character.toLowerCase(s.charAt(i));
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (hm.get(Character.toLowerCase(ch)) == 1) {
                return "" + ch;
            }
        }
        return "";
    }
}
