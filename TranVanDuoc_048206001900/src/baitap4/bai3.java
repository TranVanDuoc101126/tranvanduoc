/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap4;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class bai3 {
      public static void main(String[] args) {
        // Create an ArrayList of double values
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(29.59);
        prices.add(49.99);
        prices.add(51.49);
        prices.add(122.99);
        prices.add(919.99);

        System.out.println("Prices of products:");
        for (double price : prices) {
            System.out.println(price);
        }
    }
}
