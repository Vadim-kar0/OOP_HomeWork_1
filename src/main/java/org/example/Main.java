package org.example;


public class Main {
    public static void main(String[] args) {
        Product carrot = new Product("Carrot", 50, 4);
        Product potato = new Product("Potato", 40, 4);
        Product onion = new Product("Onion", 30, 4);
        Product apple = new Product("Apple", 80, 4);
        Product lemon = new Product("Lemon", 20, 4);
        Product banana = new Product("Banana", 10, 4);
        CategoryOfProduct.showAllProducts();
        User user = new User("Vasya", "qwerty");
        System.out.println(user);
        user.buing(carrot);
        System.out.println("=================");
        CategoryOfProduct.showAllProducts();
        System.out.println("=================");
        System.out.println(user);
        System.out.println("=================");
        User user1 = new User("Petya", "qwerty1");
        user1.buing(onion);
        user1.buing(potato);
        user1.buing(apple);
        System.out.println(user1);
        System.out.println("=================");
        CategoryOfProduct.showAllProducts();
    }
}
