import java.util.ArrayList;
import java.util.List;

// url https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
public class Task11 {
    public static void main(String[] args) {
        System.out.println(persistance(999));
    }
        public static int persistance(int num){
            int persistenceCount = 0;
            while (num >= 10) {
                List<Integer> digitsList = convertIntToDigits(num);
                num = multiplyTheArr(digitsList);
                persistenceCount++;
            }
            return persistenceCount;
        }

        public static int multiplyTheArr(List<Integer> listOfDigits){
            int result = 1;
            for (int digit : listOfDigits) {
                result *= digit;
            }
            return result;
        }

        public static List<Integer> convertIntToDigits(int num){
            String intAsString = String.valueOf(num);
            List<Integer> digitsList = new ArrayList<>();
            for(int i=0; i<intAsString.length();i++){
                char digit = intAsString.charAt(i);
                digitsList.add(Character.getNumericValue(digit));
            }
            return digitsList;
        }

        // or

    public static int persistence(long n) {
        if (n < 10) {
            return 0;
        }
        return 1 + persistence(multiplyDigits(n));
    }
    /**
     * given an integer produce the product of the given integers digits.
     * example: multiplyDigits(785) = 7 * 8 * 5 = 280
     * @param n
     * @return the product of the digits that comprise n
     */
    private static long multiplyDigits(long n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * multiplyDigits(n / 10);
    }


    // to convert int to arrays of its digits
//    int temp = test;
//    ArrayList<Integer> array = new ArrayList<Integer>();
//do{
//        array.add(temp % 10);
//        temp /= 10;
//    } while  (temp > 0);
}
