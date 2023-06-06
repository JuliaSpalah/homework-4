public class Task3 {
    public static void main(String[] args) {
        int result;
        result = addition(0);
            System.out.println(result);
        result = addition(9);
        System.out.println(result);
        result = addition(-3);
        System.out.println(result);





    }
    private static int addition(int a){
        return ++a;
    }

}
