package demo2_ss09;

import java.util.Scanner;

public class WashingMachine extends Machine {
    private double capacity;
    private boolean hasDryer;

    public WashingMachine() {
    }

    public WashingMachine(String model, String manufacturer, int yearOfManufacture, double power, double capacity, boolean hasDryer) {
        super(model, manufacturer, yearOfManufacture, power);
        this.capacity = capacity;
        this.hasDryer = hasDryer;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }
}
