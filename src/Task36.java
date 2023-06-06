import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
       String result;
        result = getWord("seas", "onal");
        System.out.println(result);
        result = getWord("comp", "lete");
        System.out.println(result);
        result = getWord("lang", "uage");
        System.out.println(result);

    }
    private static String getWord(String a, String b){
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        return a+b;
    }
}
