public class UniqueElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println("Le nombre unique est : " + findUnique(nums));
    }

    public static int findUnique(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num; // XOR operation
        }
        return unique;
    }
}

