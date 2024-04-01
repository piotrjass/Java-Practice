import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// url https://leetcode.com/problems/two-sum/
public class Task27 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            int currentValue = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(currentValue + nums[j] == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int[] intArray = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return intArray;
    }

// better solution

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

// better solution

