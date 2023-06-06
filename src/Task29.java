public class Task29 {
    public static void main(String[] args) {
        boolean result;
        result = match("hello", "hELLo");
        System.out.println(result);
        result = match("motive", "emotive");
        System.out.println(result);
        result = match("venom", "VENOM");
        System.out.println(result);
        result = match("mask", "mAskinG");
        System.out.println(result);

    }
    private static boolean match(String a, String b){
        return a.equalsIgnoreCase(b);
    }
}
