import java.util.ArrayList;

public class Task28 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        ArrayList<Character> arr = changeIntToCharArray(x);
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            if (arr.get(left) != arr.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static ArrayList<Character> changeIntToCharArray  (int num){
        ArrayList<Character> charList = new ArrayList<>();
        String numberStr = Integer.toString(num);
        for (int i = 0; i < numberStr.length(); i++) {
            charList.add(numberStr.charAt(i));
        }
        return charList;
    }
}
