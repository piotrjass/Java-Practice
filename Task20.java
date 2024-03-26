import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

// url https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
public class Task20 {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 1, 2, 1, 2, 3};
        int maxOccurrences = 2;
        int[] result = deleteNth(elements, maxOccurrences);
    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for(int el : elements){
            occurrences.put(el,occurrences.getOrDefault(el, 0) + 1 );
            if(occurrences.get(el)<=maxOccurrences){
                result.add(el);
            }
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        System.out.println(result);
        return arr;
    }
}
