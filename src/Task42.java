public class Task42 {
    public static void main(String[] args) {
        System.out.println(largestSwap(27));
        System.out.println(largestSwap(43));
        System.out.println(largestSwap(14));
        System.out.println(largestSwap(53));
        System.out.println(largestSwap(99));

        System.out.println(largestSwap2(27));
        System.out.println(largestSwap2(43));
        System.out.println(largestSwap2(14));
        System.out.println(largestSwap2(53));
        System.out.println(largestSwap2(99));

        System.out.println(largestSwap3(27));
        System.out.println(largestSwap3(43));
        System.out.println(largestSwap3(14));
        System.out.println(largestSwap3(53));
        System.out.println(largestSwap3(99));
    }

    private static boolean largestSwap(Integer firstNumber) {
        String numberString = firstNumber.toString();
        // Компілятор бачить "" першого учасника виразу і
        // намагається привести усіх інших учасників виразу до типу першого учасника.
        // Такий підхід буде працювати тільки для двозначних чисел
        // Можна було б використати StringBuilder.
        String reversedString = "" + numberString.charAt(1) + numberString.charAt(0);
        int secondNumber = Integer.parseInt(reversedString);
        return firstNumber >= secondNumber;
    }

    private static boolean largestSwap2(int firstNumber) {
        // Підходить для будь-яких чисел
        String reversedString = new StringBuilder().append(firstNumber).reverse().toString();
        int secondNumber = Integer.parseInt(reversedString);
        return firstNumber >= secondNumber;
    }

    private static boolean largestSwap3(int x) {
        // Такий підхід буде працювати тільки для двозначних чисел. Більш продуктивний.
        return x >= (x % 10) * 10 + x / 10;
    }
}
