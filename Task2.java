// url https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(task.Solution("Hey fellow warriors"));
    }
    public String Solution(String sentence){
        String[] words = sentence.split(" ");
                List<String> returnSentence = new ArrayList<>();
                for(String word : words){
                    if(word.length() < 5){
                        returnSentence.add(word);
                    } else {
                        returnSentence.add(reverseWord(word));
                    }
                }
                return String.join(" ", words);
    }

    public String reverseWord(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
