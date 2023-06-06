public class Task47 {
    public static void main(String[] args) {
        System.out.println(leftDigit("TrAdE2W1n95!"));
        System.out.println(leftDigit("V3r1ta$"));
        System.out.println(leftDigit("U//DertHe1nflu3nC3"));
        System.out.println(leftDigit("J@v@5cR1PT"));
    }

    private static int leftDigit(String symbols) {
        for (int i = 0; i < symbols.length(); i++) {
            char letter = symbols.charAt(i);
            try {
                int digit = Integer.parseInt(String.valueOf(letter));
                return digit;
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }
}
