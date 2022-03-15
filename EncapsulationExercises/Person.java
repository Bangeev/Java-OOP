package EncapsulationExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);

        this.products = new ArrayList<>();

    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if (name.trim().length() <= 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {

            this.products.add(product);
            this.money -= product.getCost();

        } else {
            String message = String.format("%s can't afford %s", this.name, product.getName());
            throw new IllegalArgumentException(message);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        String postfix;
        if (this.products.size() > 0)
            postfix = products.stream()
                .map(product -> product.getName())
                .collect(Collectors.joining(", "));
        else
            postfix = "Nothing bought";
        return this.name + " - " + postfix;

    }


}
