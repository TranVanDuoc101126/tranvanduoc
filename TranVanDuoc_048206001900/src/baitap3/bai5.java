
package baitap3;
import java.util.Arrays;

public class bai5 {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 8, 1, 3};
        sortArray(inputArray);
        
        
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(inputArray));
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // So sánh và hoán đổi nếu cần
                if (array[j] > array[j + 1]) {
                    // Hoán đổi array[j] và array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

