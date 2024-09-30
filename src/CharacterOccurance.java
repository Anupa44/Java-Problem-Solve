import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

    public static void main(String[] args) {
        String input = "I live in Dhaka";
        input = input.toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (charCountMap.containsKey(c)) {
                System.out.println(c + " " + charCountMap.get(c));
                charCountMap.remove(c);
            }
        }
    }
}

