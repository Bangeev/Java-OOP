package EncapsulationExercises;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setCost(cost);
        this.setName(name);

    }

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    private void setName(String name) {
        if (name.trim().length() <= 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }


}
