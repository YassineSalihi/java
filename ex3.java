import java.util.Arrays;

public class EvenOddSortInsertion {
    public static void main(String[] args) {
        int[] array = {3, 8, 5, 2, 4, 7};
        sortEvenOdd(array);
        System.out.println("Tableau trié : " + Arrays.toString(array));
    }

    public static void sortEvenOdd(int[] array) {
        int insertPos = 0; // Position where even numbers should be inserted

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                // Shift elements right to make space
                for (int j = i; j > insertPos; j--) {
                    array[j] = array[j - 1];
                }
                array[insertPos] = temp;
                insertPos++; // Move the insert position forward
            }
        }
    }
}

