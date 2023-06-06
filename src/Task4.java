public class Task4 {
    public static void main(String[] args) {
        boolean result;
        result = isSameNum(4, 8);
        System.out.println(result);
        result = isSameNum(2, 2);
        System.out.println(result);
        result = isSameNum(42, 32);
        System.out.println(result);


    }

    private static boolean isSameNum(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }
}
