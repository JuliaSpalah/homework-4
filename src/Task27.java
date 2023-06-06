public class Task27 {
    public static void main(String[] args) {
        boolean result;
        result = hasSpaces("hello");
        System.out.println(result);
        result = hasSpaces("hello, world");
        System.out.println(result);
        result = hasSpaces(" ");
        System.out.println(result);
        result = hasSpaces("");
        System.out.println(result);
        result = hasSpaces(",./!@#");
        System.out.println(result);

    }
    private static boolean hasSpaces(String a){
        return a.contains(" ");
    }
}
