// url https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
public class Task25 {
    public static int sequence(int[] arr) {
        int currSum = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            // wybieramy wieksza wartosc z obecnej sumy lub sumy maksymalnej
            currSum = Math.max(0,currSum);
            // zwiekszamy lub zmniejszamy obecna sume
            currSum += arr[i];
            // jesli obecna suma zostala zmniejszona, to maxSuma pozostaje taka sama
            // jesli obecna suma zostala zwiekszona, to maxSuma zwieksza sie
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

}
