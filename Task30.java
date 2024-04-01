// url https://leetcode.com/problems/longest-common-prefix/
public class Task30 {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }
        String firstWord = strs[0];
        for(int i=0; i<firstWord.length(); i++){
            char currentChar = firstWord.charAt(i);

            for(int j=0; j< strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);

        }
        return "";
    }
}
