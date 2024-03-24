import java.util.ArrayList;
import java.util.List;

// url https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
public class Task15 {

    public static void main(String[] args) {
        System.out.println(digPow(89,1));
    }
    public static long digPow(int n, int p) {
        int origianlN= n;
        int[] arr = new int[String.valueOf(n).length()];
        int i = 0;
        while (n > 0) {
            arr[i++] = n % 10;
            n /= 10;
        }
        long result = 0;
        int power = p;
        for (int digit : arr) {
            result += Math.pow(digit, power++);
        }

        return result;
    }

    // the correct result

    public static long digPow2(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }

}
