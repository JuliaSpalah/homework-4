public class Task18 {
    public static void main(String[] args) {
        boolean result;
        result = reverse(true);
        System.out.println(result);
        result= reverse(false);
        System.out.println(result);

    }
    private static boolean reverse(boolean value){
        return !value;
    }
}
