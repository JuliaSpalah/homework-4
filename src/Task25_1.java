public class Task25_1 {
    public static void main(String[] args) {

        System.out.println(returnNegative(4));
        System.out.println(returnNegative(5));
        System.out.println(returnNegative(-54));
        System.out.println(returnNegative(0));

    }

    private static int returnNegative(int a) {
        if (a > 0) {
            return -a;
        } return a;
    }
}
