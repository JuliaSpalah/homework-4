import java.util.HashSet;
import java.util.Set;

public class Task47_3 {
    public static void main(String[] args) {
        System.out.println(doubleLetters("loop"));
        System.out.println(doubleLetters("yummy"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("munchkin"));

    }

    private static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++)
            if (word.charAt(i) == word.charAt(i + 1))
                return true;
        return false;
    }
}

