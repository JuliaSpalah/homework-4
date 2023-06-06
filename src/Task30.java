public class Task30 {
    public static void main(String[] args) {
        boolean result;
        result = isSafeBridge("####");
        System.out.println(result);
        result = isSafeBridge("## ####");
        System.out.println(result);
        result = isSafeBridge("#");
        System.out.println(result);
        result = isSafeBridge("### ####");
        System.out.println(result);
        result = isSafeBridge("#####");
        System.out.println(result);

    }

    private static boolean isSafeBridge(String a) {
        // Спочатку відбуввється виклик функції a.contains , а потім ! не
        return !(a.contains(" "));
    }
}
