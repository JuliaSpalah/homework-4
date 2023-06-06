public class Task15 {
    public static void main(String[] args) {
        int result;
        result = footballPoints(3, 4, 2);
        System.out.println(result);
        result = footballPoints(5, 0, 2);
        System.out.println(result);
        result = footballPoints(0, 0, 1);
        System.out.println(result);
    }
    public static int footballPoints(int wins, int draws, int losses){
        return wins*3+draws*1+losses*0;
    }
}
