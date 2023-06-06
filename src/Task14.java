public class Task14 {
    public static void main(String[] args) {
int result;
        result = animals(2, 3, 5);
        System.out.println(result);
        result = animals(1, 2, 3);
        System.out.println(result);
        result = animals(5, 2, 8);
        System.out.println(result);
    }

    public static int animals(int chicken, int cows, int pigs){
        return chicken*2+cows*4+pigs*4;
    }
}
