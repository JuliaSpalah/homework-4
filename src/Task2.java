public class Task2 {

    public static void main(String[] args) {
        int result;
        result = minToSec(5);
        System.out.println(result);
        result = minToSec(3);
        System.out.println(result);
        result = minToSec(2);
        System.out.println(result);

    }

    private static int minToSec(int min) {
        return min * 60;
    }
}
