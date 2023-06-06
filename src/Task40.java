public class Task40 {
    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));
    }

    private static boolean isAvgWhole(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum = sum + value;
        }
        return sum % numbers.length == 0;
    }
}

