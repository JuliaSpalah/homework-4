import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task46 {
    public static void main(String[] args) {
        System.out.println(maxTotal(Arrays.asList(1, 1, 0, 1, 3, 10, 10, 10, 10, 1)));
        System.out.println(maxTotal(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 100)));
        System.out.println(maxTotal(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));

    }

    private static int maxTotal(List<Integer> numbers) {
        int sum = 0;
        Collections.sort(numbers, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
