
import java.util.HashMap;
import java.util.Map;

public class NonDuplicateNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numberCountMap.containsKey(numbers[i])) {
                numberCountMap.put(numbers[i], numberCountMap.get(numbers[i]) + 1);
            } else {
                numberCountMap.put(numbers[i], 1);
            }
        }
        System.out.print("Non-duplicate numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numberCountMap.get(numbers[i]) == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

