public class Task39 {
    public static void main(String[] args) {
        System.out.println(canCapture("A8", "E8"));
        System.out.println(canCapture("A1", "B2"));
        System.out.println(canCapture("H4", "H3"));
        System.out.println(canCapture("F5", "C8"));
    }

    private static boolean canCapture(String firstRook, String secondRook) {
        if (firstRook.charAt(0) == secondRook.charAt(0) || firstRook.charAt(1) == secondRook.charAt(1)) {
            return true;
        }
        return false;
    }
}
