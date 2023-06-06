public class Task16 {
    public static void main(String[] args) {
        boolean result;
        result = makesTen(9, 10);
        System.out.println(result);
        result = makesTen(9, 9);
        System.out.println(result);
        result = makesTen(1, 9);
        System.out.println(result);
    }
    public static boolean makesTen(int a, int b){
        if(a==10 || b==10 || a+b==10){
            return true;
        } else {
            return false;
        }
    }
}
