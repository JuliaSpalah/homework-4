public class Task17_1 {
    public static void main(String[] args) {
        boolean result;
        result = divisibleByFive(5);
        System.out.println(result);
        result = divisibleByFive(-55);
        System.out.println(result);
        result = divisibleByFive(37);
        System.out.println(result);
    }

    private static boolean divisibleByFive(int a) {
        return a % 5 == 0;
    }

}
