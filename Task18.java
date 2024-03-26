// url https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
public class Task18 {

    public static void main(String[] args) {
        String[] tower = towerBuilder(5); // Wywołanie funkcji towerBuilder() z argumentem 5
        for (String floor : tower) {
            System.out.println(floor); // Wydrukowanie każdego piętra wieży
        }
    }
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++)
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        return tower;
    }
}
