public class Task35_3 {
    public static void main(String[] args) {
        String result;
        result = sayHelloBye("alon", 1);
        System.out.println(result);
        result = sayHelloBye("Tomi", 0);
        System.out.println(result);
        result = sayHelloBye("jose", 0);
        System.out.println(result);

    }

    private static String sayHelloBye(String a, int b) {
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        if (b == 1) {
            return "Hello" + " " + a;
        } else {
            return "Bye" + " " + a;
        }
    }
}
