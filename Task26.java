import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// url https://www.codewars.com/kata/55c6126177c9441a570000cc
public class Task26 {

    public static void main(String[] args) {

    }
    public static String orderWeight(String str) {
        List<Integer> resultList =  new ArrayList<>();
        String[] words = str.split(" ");
        for(String word : words){
            int temp = countTheNumber(word);
            resultList.add(temp);
        }
        Collections.sort(resultList);
        StringBuilder resultString = new StringBuilder();
        for (Integer num : resultList) {
            resultString.append(num).append(" ");
        }


        resultString.deleteCharAt(resultString.length() - 1);

        return resultString.toString();
    }

    public static int countTheNumber(String number){
        String numberString = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (Character.isDigit(c)) {
                // Obliczenie wartości cyfry
                int value = Character.getNumericValue(c);
                sum += value;
            }
        }
        return sum;
    }
}
