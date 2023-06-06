public class Task22 {
    public static void main(String[] args) {
        boolean result;
        result = profitableGamble(0.2, 50, 9);
        System.out.println(result);
        result = profitableGamble(0.9, 1, 2);
        System.out.println(result);
        result = profitableGamble(0.9, 3, 2);
        System.out.println(result);

    }
    private static boolean profitableGamble(double prob, double price, double pay){
        if(prob*price>pay){
            return true;
        } else{
            return false;
        }
    }
}
