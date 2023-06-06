public class Task12 {
    public static void main(String[] args) {
        String result;
        result = helloName("Gerald");
        System.out.println(result);
        result = helloName("Tiffany");
        System.out.println(result);
        result = helloName("Ed");
        System.out.println(result);
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
