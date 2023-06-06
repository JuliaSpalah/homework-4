public class Task19 {
    public static void main(String[] args) {
        boolean result;
        result = and(true, false);
        System.out.println(result);
        result = and(true, true);
        System.out.println(result);
        result = and(false, true);
        System.out.println(result);
        result = and(false, false);
        System.out.println(result);

    }
    private static boolean and(boolean a, boolean b){
        return a==true && b==true;
    }
}
