public class Task20 {
    public static void main(String[] args) {
        int result;
        result = howManyWalls(54, 1, 43);
        System.out.println(result);
        result = howManyWalls(45, 5, 4);
        System.out.println(result);
        result = howManyWalls(100, 4, 5);
        System.out.println(result);
        result = howManyWalls(10, 15, 12);
        System.out.println(result);
        result = howManyWalls(41, 3, 6);
        System.out.println(result);
    }

    private static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }
}
