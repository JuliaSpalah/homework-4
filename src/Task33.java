public class Task33 {
    public static void main(String[] args) {
        boolean result;
        result = checkEnding("abc", "bc");
        System.out.println(result);
        result = checkEnding("abc", "d");
        System.out.println(result);
        result = checkEnding("samurai", "zi");
        System.out.println(result);
        result = checkEnding("feminine", "nine");
        System.out.println(result);
        result = checkEnding("convention", "tio");
        System.out.println(result);
    }
    private static boolean checkEnding(String a, String b){
        return a.endsWith(b);
    }
}
