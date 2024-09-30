public class SecondHighestScore {
    public static void main(String[] args) {
        double[] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest = CGPA[0];
        double SecondHighest = -1;
        for (int i = 1; i < CGPA.length; i++) {
            if (CGPA[i] > highest) {
                SecondHighest = highest;
                highest = CGPA[i];
            } else if (CGPA[i] > SecondHighest && CGPA[i] != highest) {
                SecondHighest = CGPA[i];
            }
        }
        System.out.println("Second highest score is :" + SecondHighest);
    }


}
