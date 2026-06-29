package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("Smartphone", 1000.0));
        products.add(new Clothing("Jacket", 200.0));
        products.add(new Food("Bread", 3.0));

        for (Product product : products) {
            System.out.println("Product: " + product.getName() + " | Final Price: " + product.getFinalPrice());
        }
    }

    interface Product {
        double getFinalPrice();

        String getName();
    }

    static class Electronics implements Product {
        private String name;
        private double price;

        public Electronics(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public double getFinalPrice() {
            return price * 0.90;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class Clothing implements Product {
        private String name;
        private double price;

        public Clothing(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public double getFinalPrice() {
            return price * 0.85;
        }

        @Override
        public String getName() {
            return name;
        }
    }



    static class Food implements Product {
        private String name;
        private double price;

        public Food(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public double getFinalPrice() {
            return price;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
