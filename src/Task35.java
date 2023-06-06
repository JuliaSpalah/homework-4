public class Task35 {
    public static void main(String[] args) {
        String result;
        result = reverse("Hello World");
        System.out.println(result);
        result = reverse("The quick brown fox.");
        System.out.println(result);
        result = reverse("Edabit is really helpful!");
        System.out.println(result);

    }

    private static String reverse(String a) {
        // Class StringBuilder. Не створює нові рядки. Просто збирає букви.
        StringBuilder result = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            // Append - функція String builder. В данному випадку додає букву під індексом і.
            result.append(a.charAt(i));
        }
        // toString функція створює рядок з букв, які назбирав StringBuilder
        return result.toString();


    }
}
