public class PairSum {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, 3, 5, 7};
        int target = 7;
        findPairs(array, target);
    }

    public static void findPairs(int[] array, int target) {
        System.out.print("Paires : ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.print("(" + array[i] + "," + array[j] + ") ");
                }
            }
        }
    }
}

