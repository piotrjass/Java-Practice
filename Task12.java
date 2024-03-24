import java.util.ArrayList;
import java.util.List;

public class Task12 {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
    static String toCamelCase(String s){
        if(s.isEmpty()) {
            return "";
        }
        String[] words = s.split("[ _-]");
        List<String> resultWords = new ArrayList<>();
        resultWords.add(words[0]);
        for(int i=1; i<words.length;i++){
            String currentWord = words[i];
            if (!currentWord.isEmpty()) {
                resultWords.add(currentWord.substring(0, 1).toUpperCase() + currentWord.substring(1));
            }
        }
        String result = String.join("", resultWords);
        return result;
    }
}
