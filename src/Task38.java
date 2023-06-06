public class Task38 {
    public static void main(String[] args) {
        System.out.println(countVowels("Celebration"));
        System.out.println(countVowels("Palm"));
        System.out.println(countVowels("Prediction"));
    }

    private static int countVowels(String word) {
        int quantity = 0;
        for (char letter : word.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                // паттерн акумулятор
                quantity++;
            }
        }
        return quantity;
    }
}
