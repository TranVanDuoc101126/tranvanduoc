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
public class bai4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        boolean containsLondon = cities.contains("London");

        System.out.println( containsLondon);
    }
}
