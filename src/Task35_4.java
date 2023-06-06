import java.util.Arrays;

public class Task35_4 {
    public static void main(String[] args) {
        int[] result;
        result = calculateScores("A");
        System.out.println(Arrays.toString(result));
        result = calculateScores("ABC");
        System.out.println(Arrays.toString(result));
        result = calculateScores("ABCBACC");
        System.out.println(Arrays.toString(result));

    }
    private static int[] calculateScores(String initial){
        int[] result = {0,0,0};
        for (int i = 0; i < initial.length(); i++) {
            if (initial.charAt(i)=='A'){
                result[0]++;
            }
            if (initial.charAt(i)=='B'){
                result[1]++;
            }
            if (initial.charAt(i)=='C'){
                result[2]++;
            }
        }
return result;
    }
}
