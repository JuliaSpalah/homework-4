public class Task7 {
    public static void main(String[] args) {
        int result;
        result = triArea(3, 2);
        System.out.println(result);
        result = triArea(7, 4);
        System.out.println(result);
        result = triArea(10, 10);
        System.out.println(result);
    }

    public static int triArea(int base, int height) {
        return (base * height) / 2;
    }
}
