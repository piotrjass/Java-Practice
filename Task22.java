// url https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
public class Task22 {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }
    public static String pigIt(String str) {
        if(str.isEmpty()){
            return "";
        }
        String result = "";
        String[] words = str.split(" ");
        for(String word : words){
            String temp = word.substring(1) + word.charAt(0) + "ay ";
            result += temp;
        }
        return  result;
    }
}
