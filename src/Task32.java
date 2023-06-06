public class Task32 {
    public static void main(String[] args) {
        int result;
        result = countWords("Just an example here move along");
        System.out.println(result);
        result = countWords("This is a test");
        System.out.println(result);
        result = countWords("What an easy task, right");
        System.out.println(result);
    }

    private static int countWords(String a) {
        // Функція Split ділить рядок на підрядки за допомогою делімітера (розділювача). В данному випадку це пробіл.
        return a.split(" ").length;
    }
}
