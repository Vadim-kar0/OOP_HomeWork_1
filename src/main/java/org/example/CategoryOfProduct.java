package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CategoryOfProduct {
    private static ArrayList<Product> allProducts = new ArrayList<>();
    private static ArrayList<Product> vegetables = new ArrayList<>();
    private static ArrayList<Product> fruits = new ArrayList<>();

    public static ArrayList getVegetables() {
        return vegetables;
    }

    public static ArrayList getFruits() {
        return fruits;
    }


    public static void addVegetable(Product product) {
        allProducts.add(product);
        vegetables.add(product);
    }

    public static void addFruit(Product product) {
        allProducts.add(product);
        fruits.add(product);
    }

    public static void deleteVegetable(Product product) {
        allProducts.remove(product);
        vegetables.remove(product);
    }

    public static void deleteFriut(Product product) {
        allProducts.remove(product);
        fruits.remove(product);
    }


    public static void showVegetables() {
        System.out.println(vegetables.toString().replaceAll("},", "},\n"));

    }

    public static void showFruits() {
        System.out.println(fruits.toString().replaceAll("},", "},\n"));

    }

    public static void showAllProducts() {
        System.out.println(allProducts.toString().replaceAll("},", "},\n"));

    }


}
