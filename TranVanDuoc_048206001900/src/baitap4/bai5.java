
package baitap4;
import java.util.ArrayList;
import java.util.Random;
public class bai5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1); 
        }

        System.out.println("Original list: " + numbers);

        numbers.remove(3);

        System.out.println("Updated list after removing the element at index 3: " + numbers);
    }
}
