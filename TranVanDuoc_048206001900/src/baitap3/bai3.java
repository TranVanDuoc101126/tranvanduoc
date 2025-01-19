
package baitap3;


public class bai3 {
    public static boolean Palindrome(int[] mang) {
        int n = mang.length; 
        for (int i = 0; i < n / 2; i++) {
            if (mang[i] != mang[n - 1 - i]) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 2, 1};
        System.out.println("Mang ban dau:");
        for (int i : mang) {
            System.out.print(i + " ");
        }
        if (Palindrome(mang)) {
            System.out.println("\ntrue");
        } else {
            System.out.println("false");
        }
    }

}

