import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task45 {
    public static void main(String[] args) {
        System.out.println(sortNumsAscending(Arrays.asList(1, 2, 10, 50, 5)));
        System.out.println(sortNumsAscending(Arrays.asList(80, 29, 4, -95, -24, 85)));
        System.out.println(sortNumsAscending(null));
        System.out.println(sortNumsAscending(new ArrayList<>()));

    }

    private static List<Integer> sortNumsAscending(List<Integer> array) {
        if (array==null || array.isEmpty()){
            return new ArrayList<>();
        }
        Collections.sort(array);
        return array;
    }
}
