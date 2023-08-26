package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Product {
    private static final ArrayList<String> choseCategoryVegetables =
            new ArrayList<>(Arrays.asList("Carrot", "Onion", "Potato", "Cucumber"));
    private static final ArrayList<String> choseCategoryFruits =
            new ArrayList<>(Arrays.asList("Apple", "Banana", "Lemon", "Watermelon"));
    private String name;
    private int price;
    private int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        if (choseCategoryVegetables.toString().contains(name)) {
            CategoryOfProduct.addVegetable(this);
        } else if (choseCategoryFruits.toString().contains(name)) {
            CategoryOfProduct.addFruit(this);
        }

    }

    public Product() {
        this("Unnamed", -1, -1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && rating == product.rating && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ",\t price=" + price +
                ",\t rating=" + rating +
                '}';
    }

    public static boolean findFruit(Product product) {
        if (CategoryOfProduct.getFruits().contains(product)) {
            return true;
        } else return false;
    }

    public static boolean findVegetable(Product product) {
        if (CategoryOfProduct.getVegetables().contains(product)) {
            return true;
        } else return false;
    }

}
