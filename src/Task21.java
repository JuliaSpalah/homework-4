public class Task21 {
    public static void main(String[] args) {
        boolean result;
        result = dividesEvenly(98, 7);
        System.out.println(result);
        result = dividesEvenly(85, 4);
        System.out.println(result);
    }

    private static boolean dividesEvenly(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
