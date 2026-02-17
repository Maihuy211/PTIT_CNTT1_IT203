package bai2;

public abstract class Vehicle {
    private String brand;

    public Vehicle() {
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void move();

}
