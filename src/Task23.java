public class Task23 {
    public static void main(String[] args) {
        String result;
        result = concatName("First", "Last");
        System.out.println(result);
        result = concatName("John", "Doe");
        System.out.println(result);
        result = concatName("Mary", "Jane");
        System.out.println(result);
    }

    private static String concatName(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }
}
