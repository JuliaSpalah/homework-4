public class Task43 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));
        System.out.println("*****");
        System.out.println(checkPalindrome2("mom"));
        System.out.println(checkPalindrome2("scary"));
        System.out.println(checkPalindrome2("reviver"));
        System.out.println(checkPalindrome2("stressed"));
    }

    private static boolean checkPalindrome(String word) {
        String reversedWord = new StringBuilder().append(word).reverse().toString();
        return word.equals(reversedWord);
    }

    private static boolean checkPalindrome2(String word) {
        // Зустрічний for
        for (int x = 0, y = word.length() - 1; x < y; x++, y--) {
            if (word.charAt(x) != word.charAt(y)) {
                return false;
            }
        }
        return true;
    }
}
