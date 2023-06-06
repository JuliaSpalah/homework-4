public class Task11 {
    public static void main(String[] args) {
        String result;
        result = giveMeSomething("is better than nothing");
        System.out.println(result);
        result = giveMeSomething("Bob Jane");
        System.out.println(result);
        result = giveMeSomething("something");
        System.out.println(result);

    }

    public static String giveMeSomething(String a) {
        // Конкатенація (об'єднання) рядків
        return "something "+a;
    }
}
