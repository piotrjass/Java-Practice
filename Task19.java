
// url https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java
public class Task19 {

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
    }
    public static String high(String s) {
       String[] words = s.split(" ");
       int max = 0;
        String maxWord = "";
       for(String word : words){
           int result = getWordValue(word);
           if(result>max){
               max=result;
               maxWord = word;
           }
       }
        return maxWord;
    }
    public static int getWordValue(String s){
        int result = 0;
        int startingASCIICode = 96;
        for(int i=0; i<s.length() ;i++){
            char temp = s.charAt(i);
            int toBeAdded = temp -96;
            result += toBeAdded;
        }
        return result;
    }

    // or the best

    public static String high2(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }

        return winner;
    }

}
