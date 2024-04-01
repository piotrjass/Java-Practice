import java.util.ArrayList;
// url https://leetcode.com/problems/length-of-last-word/
public class Task32 {


        public static void main(String[] args) {
            System.out.println(lengthOfLastWord("luffy is still joyboy"));
        }
        public static int lengthOfLastWord(String s) {
            String[] words = s.split(" ");
            return words[words.length - 1].length();
        }

}
