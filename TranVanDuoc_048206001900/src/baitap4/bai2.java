
package baitap4;
import java.util.ArrayList;
public class bai2 {
     public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Purple");

        colors.set(1, "Yellow");

        System.out.println("Updated list of colors: " + colors);
    }
}
