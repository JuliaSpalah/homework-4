public class Task8 {
    public static void main(String[] args) {
        int result;
        result = points(13, 12);
        System.out.println(result);
        result = points(17, 12);
        System.out.println(result);
        result = points(38, 8);
        System.out.println(result);
    }

    public static int points(int twoPoints, int threePoints) {
        return twoPoints * 2 + threePoints * 3;
    }
}
