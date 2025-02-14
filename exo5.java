public class MatrixPermutation {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        if (isPermutation(matrix)) {
            System.out.println("C'est une permutation.");
        } else {
            System.out.println("Ce n'est pas une permutation.");
        }
    }

    public static boolean isPermutation(int[][] matrix) {
        int N = matrix.length;
        int size = N * N;
        boolean[] seen = new boolean[size + 1]; // Index de 1 à N*N

        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 1 || num > size || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }
}

