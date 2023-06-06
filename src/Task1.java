
public class Task1 {
    public static void main(String[] args) {
        int result;
        result = sumOfTwoNumbers(3, 2);
        System.out.println(result);
        result = sumOfTwoNumbers(-3, -6);
        System.out.println(result);
       // result = sumOfTwoNumbers(7, 3);
        System.out.println(sumOfTwoNumbers(7, 3));

    }

    private static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

}