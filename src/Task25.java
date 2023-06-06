public class Task25 {
    public static void main(String[] args) {
        int result;
        result = returnNegative(4);
        System.out.println(result);
        result = returnNegative(5);
        System.out.println(result);
        result = returnNegative(-54);
        System.out.println(result);
        result = returnNegative(0);
        System.out.println(result);
    }

    private static int returnNegative(int a) {
        if (a < 0) {
            return a;
        } else {
            return -a;
        }

    }
}
