public class Task31 {
    public static void main(String[] args) {
        String result;
        result = helloWorld(3);
        System.out.println(result);
        result = helloWorld(5);
        System.out.println(result);
        result = helloWorld(15);
        System.out.println(result);
    }

    private static String helloWorld(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return "Hello World";
        } else if (a % 3 == 0) {
            return "Hello";
        } else if (a % 5 == 0) {
            return "World";

        } else {
            return "";
        }

    }
}
