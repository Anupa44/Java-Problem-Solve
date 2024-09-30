import java.util.Scanner;

public class BinarySearchOnCgpa {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        sortCgpaDecending(CGPA);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double userInput = scan.nextDouble();

        int result = binarySearch(CGPA, userInput);

        if (result == -1) {
            System.out.println("CGPA " + userInput + " not found in the array.");
        } else {
            System.out.println("CGPA " + userInput + " found at index " + result);
        }

    }

    public static int binarySearch(double[] CGPA, double key) {
        int left = 0;
        int right = CGPA.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;


            if (CGPA[mid] == key) {
                return mid;
            }

            if (CGPA[mid] > key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void sortCgpaDecending(double[] CGPA) {
        int n = CGPA.length;
        int i, j, flag = 0;
        double temp;
        for (i = 0; i < n - 1; i++) {
            flag = 0;
            for (j = 0; j < n - 1 - i; j++) {
                if (CGPA[j] < CGPA[j + 1]) {
                    temp = CGPA[j];
                    CGPA[j] = CGPA[j + 1];
                    CGPA[j + 1] = temp;
                    flag = 1;

                }
            }
            if (flag == 0)
                break;
        }


    }

}




