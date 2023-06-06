import java.util.Set;

public class Task47_1 {
    public static void main(String[] args) {
        System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
        System.out.println(removeVowels("We're gonna build a wall!"));
        System.out.println(removeVowels("Happy Thanksgiving to all--even the haters and losers!"));
    }

    private static String removeVowels(String sentence) {
        // створення змінної result типу Stringbuilder
        StringBuilder result = new StringBuilder();
        Set<Character> vowels = Set.of('a', 'e', 'o', 'u', 'i');
        for (char letter : sentence.toCharArray()) {
            // Character - вбудований клас Java.
            // оголошуєм змінну letterLowerCase і присвоюєм значення, яке повертає статична функція toLowerCase класу Character
            // відбувається анбоксінг(розпакування) типу Character в примітиний char
            char letterLowerCase = Character.toLowerCase(letter);
            // якщо vowels не містить letterLowerCase (ту букву, яка приходить в змінну letter)
            if (!vowels.contains(letterLowerCase)) {
                // в результат додаємо letter, append означає "додати в кінець"
                result.append(letter);
            }
        }
        return result.toString();
    }


}
