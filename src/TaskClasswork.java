public class TaskClasswork {
    public static void main(String[] args) {
        System.out.println(largestSwap(27));
        System.out.println(largestSwap(43));
        System.out.println(largestSwap(14));
        System.out.println(largestSwap(53));
        System.out.println(largestSwap(99));
    }

    private static boolean largestSwap(int firstNumber) {
        String reversedString = new StringBuilder().append(firstNumber).reverse().toString();
        int secondNumber = Integer.parseInt(reversedString);
        return firstNumber >= secondNumber;
    }
}
