public class Task26 {
    public static void main(String[] args) {
        boolean result;
        result = comp("AB", "CD");
        System.out.println(result);
        result = comp("ABC", "DE");
        System.out.println(result);
        result = comp("hello", "edabit");
        System.out.println(result);
    }

    private static boolean comp(String a, String b) {
        return a.length() == b.length();
    }
}

