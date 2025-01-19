package baitap3;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = {1, 2, 3, 4, 5};

        System.out.println("Mang ban dau:");
        for (int i : mang) {
            System.out.print(i + " ");
        }
        System.out.println("\nMang sau khi dao nguoc:");
        for (int i = mang.length - 1; i >= 0; i--) {
            System.out.print(mang[i] + " ");
        }
    }
}

