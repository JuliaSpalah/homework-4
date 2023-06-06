public class Task5_1 {
    public static void main(String[] args) {
        int result;
        result = findPerimeter(6,7);
        System.out.println(result);
        result = findPerimeter(20,10);
        System.out.println(result);
        result = findPerimeter(2,9);
        System.out.println(result);
    }

    public static int findPerimeter(int x, int y) {
        return x * 2 + y * 2;
    }
}
