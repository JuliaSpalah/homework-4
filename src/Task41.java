import java.util.HashSet;
import java.util.Set;

public class Task41 {
    public static void main(String[] args) {
        System.out.println(isIsogram("Algorism"));
        System.out.println(isIsogram("Password"));
        System.out.println(isIsogram("Consecutive"));
    }

    private static boolean isIsogram(String word) {
        //new HashSet<Character>();
        //Для HashSet не вказуємо тип даних, тому що він вже вказаний в типі змінної колекції Set
        Set<Character> occurrences = new HashSet<>();
        // for each працює тільки з масивами або колекціями
        for (char letter : word.toLowerCase().toCharArray()) {
            if (occurrences.contains(letter)) {
                return false;
            }
            occurrences.add(letter);
        }
        return true;
    }
}
