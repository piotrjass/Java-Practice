import java.util.ArrayList;

// url https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
public class Task17 {

    public static void main(String[] args) {
        char[] test = {'a','b','c','d','f'};
        System.out.println(findMissingLetter2(test));
    }
    public static char findMissingLetter(char[] arr) {
        int start = (int) arr[0];
        int end = (int) arr[arr.length - 1];

        for (int i = start; i < end; i++) {
            boolean found = false;
            for (char el : arr) {
                if ((int) el == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return (char) i;
            }
        }
        return ' '; // If no missing letter found, return a default value
    }
    // or

    public static char findMissingLetter2(char[] array){
        char expectableLetter = array[0];
        System.out.println("ex letter is " + expectableLetter);
        for(char letter : array){
            System.out.println("letter is " + letter);
            if(letter != expectableLetter) break;
            expectableLetter++;
            System.out.println( "new ex num is " + expectableLetter);
        }
        return expectableLetter;
    }
}
