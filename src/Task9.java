public class Task9 {
    public static void main(String[] args) {
        boolean result;
        result = lessThanOrEqualToZero(5);
        System.out.println(result);
        result = lessThanOrEqualToZero(0);
        System.out.println(result);
        result = lessThanOrEqualToZero(-2);
        System.out.println(result);
    }

    public static boolean lessThanOrEqualToZero(int x) {
        if (x <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
