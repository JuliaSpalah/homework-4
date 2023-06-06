public class Task35_1 {
    public static void main(String[] args) {
        boolean result;
        int[] numbers = {5, 3, 15, 22, 4};
        result = existsHigher(numbers, 10);
        System.out.println(result);
        result = existsHigher(new int[]{1, 2, 3, 4, 5}, 8);
        System.out.println(result);
        result = existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2}, 4);
        System.out.println(result);
        result = existsHigher(new int[]{}, 5);
        System.out.println(result);
    }

    private static boolean existsHigher(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= n) {
                return true;
            }
        }
        // return false після циклу
        return false;
    }
}
