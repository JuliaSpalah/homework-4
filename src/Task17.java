public class Task17 {
    public static void main(String[] args) {
        boolean result;
        result = divisibleByFive(5);
        System.out.println(result);
        result = divisibleByFive(-55);
        System.out.println(result);
        result = divisibleByFive(37);
        System.out.println(result);

    } public static boolean divisibleByFive(int x){
        if(x%5==0){
            return true;
        } else {
            return false;
        }
    }
}
