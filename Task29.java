import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/description/
public class Task29 {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        // tworzymy hashmape i wynik

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            // tworzymy petle dla kazdej litery stringa
            // sprawdzamy czy aktualna litera w ciągu jest mniejsza niż następna
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                // jesli tak to jest odejmowana od nastepnej, wiekszej
                ans -= m.get(s.charAt(i));
            } else {
                // jestli nie to jest dodawana
                ans += m.get(s.charAt(i));
            }
        }

        return ans;
    }

}
