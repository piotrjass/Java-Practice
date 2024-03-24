import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
// url https://www.codewars.com/kata/514b92a657cdc65150000006/train/javascript
public class Task1 {
    public static void main(String[] args) {
        int result = Solution(10);
        System.out.println("Suma liczb: " + result);
    }
    public static int Solution(int number){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<number; i++){
            if(i%3==0 || i%5==0){
                numbers.add(i);
            }
        }
        int sum = 0;
        for(int num : numbers){
            sum += num;
    }
        return sum;
}
// or simply

public int solution2(int number) {
    int sum=0;

    for (int i=0; i < number; i++){
        if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
}

// or using Streams

    public int solution(int number) {
            return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
        }

}

