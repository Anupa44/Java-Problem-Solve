import java.util.Scanner;

public class StringAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        String[] words = input.split("\\s+");
        wordCount = words.length;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != ' ') {
                charCount++;

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else if (c >= 'a' && c <= 'z') {
                    consonantCount++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }
}

