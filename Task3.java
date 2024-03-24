// url https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
import static java.util.Arrays.stream;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 1, 3};
        int result = Task3.findIt(array);
        System.out.println(result);
    }
    public static int findIt(int[] a) {
        for(int i=0; i<a.length; i++){
            int currentValue = a[i];
            int counter = 0;
            for(int j=0; j< a.length; j++){
                if(currentValue == a[j]){
                    counter +=1;
                }
            }
            if(counter % 2 ==1){
                return currentValue;
            }
        }
        return 0;
    }

// or using Stream


    public class FindOdd {
        public static int findIt(int[] arr) {
            return stream(arr).reduce(0, (x, y) -> x ^ y);
        }
    }
// or Hashmap


        public static int findIt2(int[] a) {
            Map<Integer, Integer> counts = new HashMap<>(a.length);
            for(int i : a) {
                if(!counts.containsKey(i)) counts.put(i, 1);
                else counts.put(i, counts.get(i) + 1);
            }
            for(Map.Entry<Integer, Integer> entry : counts.entrySet()) if(entry.getValue() % 2 == 1) return entry.getKey();
            return 0;
        }


}
