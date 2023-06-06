public class Task13 {
    public static void main(String[] args) {
        float result;
        result = calculateFuel(15);
        System.out.println(result);
        result = calculateFuel(23.5f);
        System.out.println(result);
        result = calculateFuel(3);
        System.out.println(result);
    }
    public static float calculateFuel(float distance){
        if (distance*10<100){
            return 100;
        } else {
            return distance * 10;

        }
    }
}
