package model;

import java.time.LocalDate;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate date) {
        super(name, price);
        this.manufactureDate = date;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate date) {
        this.manufactureDate = date;
    }

    @Override
    public String priceTag() {
        return getName() + "(used) $ " + getPrice() + " (Manufacture date: " + getManufactureDate() + ")";
    }
}
