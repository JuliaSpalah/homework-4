public class Task24 {
    public static void main(String[] args) {
boolean result;
        result = isEmpty("");
        System.out.println(result);
        result = isEmpty(" ");
        System.out.println(result);
        result = isEmpty("a");
        System.out.println(result);
    }

    private static boolean isEmpty(String a) {
        return a.equals("");
    }
}

