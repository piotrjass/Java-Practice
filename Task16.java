import java.util.Arrays;

// url
public class Task16 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findEvenIndex(arr));
    }
    public static int findEvenIndex(int[] arr) {
        int leftSum = 0;
        int totalSum = 0;
        for(int el : arr){
            totalSum +=el;
        }
        for(int i=0; i<arr.length; i++){
            totalSum -= arr[i];
            if(leftSum == totalSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
// or


//    public static int findEvenIndex(int[] arr) {
//        int left = 0;
//        int right = Arrays.stream(arr).sum();
//        for (int i=0; i<arr.length; i++){
//            right -= arr[i];
//            if (left == right) return i;
//            left += arr[i];
//        }
//        return -1;
//
//}