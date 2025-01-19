package baitap3;

public class bai2 {

    public static void main(String[] args) {

        int[] mang = {10, 20, 5, 7, 8};
        int max = mang[0];
        int min = mang[0];
        System.out.println("Mang ban dau:");
        for (int i : mang) {
            System.out.print(i + " ");
        }
            for (int n : mang) {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
            System.out.println("\nMaximum value: " + max);
            System.out.println("Minimum value: " + min);
        }

    }
