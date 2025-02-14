public class JaggedArraySum {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        calculateRowSums(jaggedArray);
    }

    public static void calculateRowSums(int[][] jaggedArray) {
        for (int i = 0; i < jaggedArray.length; i++) {
            int sum = 0;
            for (int num : jaggedArray[i]) {
                sum += num;
            }
            System.out.println("Somme de la ligne " + (i + 1) + " : " + sum);
        }
    }
}

