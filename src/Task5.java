public class Task5 {
    public static void main(String[] args) {
        int result;
        result = howManySeconds(2);
        System.out.println(result);
        result = howManySeconds(10);
        System.out.println(result);
        result = howManySeconds(24);
        System.out.println(result);
    }
    private static int howManySeconds(int hour) {
        return hour * 3600;
    }
}
