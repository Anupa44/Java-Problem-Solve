public class SortCgpa {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        sortCgpaDecending(CGPA);

        System.out.println("Sorted scores in descending order:");
        for (int i = 0; i < CGPA.length; i++) {
            System.out.println(CGPA[i]);
        }

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
