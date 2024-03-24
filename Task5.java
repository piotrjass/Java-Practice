import java.util.ArrayList;
import java.util.List;

// url https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
public class Task5 {

    public static void main(String[] args) {

        System.out.println(digital_root(942));
    }

    public static int digital_root(int n) {
        while(n > 9){
            System.out.println(n/10);
            System.out.println(n%10);

            n = n/10 + n % 10;
            System.out.println(n);
            System.out.println("***");
        }
        return(n);
    }


}
