package Entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // sobrecarga de construtores:

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    //getters e setters: ENCAPSULAMENTO - primeiro pilar da poo

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.name +
                ", $ "
                + String.format("%.2f", this.price)
                + ", "
                + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}