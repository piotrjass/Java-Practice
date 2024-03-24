// url https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                output.add(a[i]);
            }
        }
        int[] ret = new int[output.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = output.get(i);

        return ret;
    }
    // or using streams

//    public class Kata {
//        public static int[] arrayDiff(int[] a, int[] b) {
//            List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//            List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//            listA.removeAll(listB);
//            return listA.stream().mapToInt(e -> e).toArray();
//        }
}
