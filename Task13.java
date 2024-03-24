import java.util.ArrayList;

// url https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
public class Task13 {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
    public static boolean isNarcissistic(int num){
        int originalNum = num;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(num>0){
            array.add(num%10);
            num /=10;
        }
        int powerTo =  array.size();
        int narcissisticCheck =0;
        for(int el : array){
            narcissisticCheck += Math.pow(el, powerTo);
        }
      return narcissisticCheck == originalNum;
    }
    // or

    public static boolean isNarcissistic2(int number) {
        String strNumber = String.valueOf(number);
        char[] digits = strNumber.toCharArray();
        int sum = 0;
        for(char digit : digits)
            sum += Math.pow(Integer.parseInt(String.valueOf(digit)), digits.length);
        return sum == number ? true : false;
    }
}
