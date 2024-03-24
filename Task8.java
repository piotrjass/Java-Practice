// url https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class Task8 {
    public static void main(String[] args) {
        System.out.println(findOddOrEven(new int[]{2, 4, 0, 100, 4, 11, 2602, 36}));

    }

    public static int findOddOrEven(int[] integers) {
        String type = hasMoreEvenOrOdds(integers);
        System.out.println(type);
        for (int num : integers) {
            if (type.equals("Odd") && num % 2 == 0) {
                return num;
            }
            if (type.equals("Even") && num % 2 == 1) {
                return num;
            }
        }
        return 0;
    }

    public static String hasMoreEvenOrOdds(int[] integers) {
        int oddCount = 0;
        int evenCount = 0;
        for(int num: integers){
            if(isOdd(num)){
                oddCount +=1;
            }
            evenCount+=1;
        }
        if (oddCount > evenCount) {
            return "Odd";
        } else if (evenCount > oddCount) {
            return "Even";
        } else {
            return "Equal";
        }
    }

    public static boolean isOdd(int num){
        return num % 2 == 1;
    }
}
