public class MaxSumRow {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            {2, 5},
            {1, 2, 3, 4},
            {1, 1, 3}
        };

        findMaxSumRow(jaggedArray);
    }

    public static void findMaxSumRow(int[][] jaggedArray) {
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < jaggedArray.length; i++) {
            int sum = 0;
            for (int num : jaggedArray[i]) {
                sum += num;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
        }

        System.out.println("La ligne avec la plus grande somme est la ligne "
				+ (maxRowIndex + 1) + " avec une somme de " + maxSum + ".");
    }
}

