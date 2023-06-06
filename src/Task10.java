public class Task10 {
    public static void main(String[] args) {
        int result;
        result = remainder(1, 3);
        System.out.println(result);
        result = remainder(3, 4);
        System.out.println(result);
        result = remainder(-9, 45);
        System.out.println(result);
        result = remainder(5, 5);
        System.out.println(result);
    }

    public static int remainder(int x, int y) {
        return x % y;
    }
}
