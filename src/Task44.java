public class Task44 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
        System.out.println(isValid("00000"));
    }

    private static boolean isValid(String code) {
        try {
            // parseUnsinedInt розбирає рядок і намагається перетворити на число без знаку мінус.
            Integer.parseUnsignedInt(code);
            // Якщо не вийшло перетворити на число, catch ловить виняток.
        } catch (NumberFormatException exception) {
            return false;
        }
        // Якщо виняток не стався, ми не потрапили в catch
        return code.length() == 5;
    }
}
