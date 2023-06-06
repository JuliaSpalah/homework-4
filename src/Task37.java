public class Task37 {
    public static void main(String[] args) {
        String result;
        result = bomb("There is a bomb.");
        System.out.println(result);
        result = bomb("Hey, did you think there is a BOMB?");
        System.out.println(result);
        result = bomb("This goes boom!!!");
        System.out.println(result);

    }

    private static String bomb(String a) {
        a = a.toLowerCase();
        if (a.contains("bomb")) {
            return "DUCK";
        } else {
            return "Relax, there's no bomb.";
        }
    }
}
