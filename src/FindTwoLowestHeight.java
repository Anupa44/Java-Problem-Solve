
import java.util.Scanner;

public class FindTwoLowestHeight {

    public static void main(String[] args) {
        int[] heights = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scan.nextInt();
        }
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }

        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");
    }
}

