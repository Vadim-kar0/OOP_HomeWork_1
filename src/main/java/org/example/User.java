package org.example;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    Busket busket = new Busket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private class Busket {
        private ArrayList<Product> usersProducts = new ArrayList<>();

        @Override
        public String toString() {
            return "Busket{" +
                    "usersProducts=\n" + usersProducts +
                    '}';
        }
    }

    @Override
    public String toString() {
        String a = busket.toString().
                replaceAll("},", "},\n");
        return "User{" +
                "login='" + login + '\'' +
                ", busket=" + a +
                '}';
    }

    public void buing(Product product) {
        if (Product.findFruit(product)) {
            busket.usersProducts.add(product);
            CategoryOfProduct.deleteFriut(product);
        } else if (Product.findVegetable(product)) {
            busket.usersProducts.add(product);
            CategoryOfProduct.deleteVegetable(product);
        }


    }

}
