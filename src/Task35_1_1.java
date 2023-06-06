public class Task35_1_1 {
    public static void main(String[] args) {
        System.out.println(existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        /*System.out.println(existsHigher());
        System.out.println(existsHigher());
        System.out.println(existsHigher());*/
    }

    public static boolean existsHigher(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= n) {
                return true;
            }
        }
        return false;

    }
}
