public class Task47_2 {
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }

    private static int getDecimalPlaces(String numbers) {
        if (!numbers.contains(".")) {
            return 0;
        }
        // Два слеша бо крапку треба екранувати. Вона сприймається, як "будь-який символ"
        String[] splited = numbers.split("\\.", 2);
        return splited[1].length();

    }
}
