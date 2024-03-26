// url https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java
public class Task23 {
    public static void main(String[] args) {
        System.out.println(makeReadable(359999  ));
    }

    public static String makeReadable(int seconds) {
        int Minutes = 0;
        int Hours = 0;
        while(seconds>=60){
            Minutes +=1;
            seconds = seconds-60;
        }
        while (Minutes > 59) {
            Hours +=1;
            Minutes = Minutes -60;
        }
        int sec = seconds;

        String formattedHours = String.format("%02d", Hours);
        String formattedMinutes = String.format("%02d", Minutes);
        String formattedSeconds = String.format("%02d", sec);

        return formattedHours + ":" + formattedMinutes + ":" + formattedSeconds;
    }

    // or simple

    public static String makeReadable2(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
    }
}
