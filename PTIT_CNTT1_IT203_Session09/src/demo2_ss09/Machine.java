package demo2_ss09;

import java.util.Scanner;

public class Machine {
    private String model;
    private String manufacturer;
    private int yearOfManufacture;
    private double power;

    public Machine() {
    }

    public Machine(String model, String manufacturer, int yearOfManufacture, double power) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap model: ");
        model = sc.nextLine();

        System.out.print("Nhap nha san xuat: ");
        manufacturer = sc.nextLine();

        System.out.print("Nhap nam san xuat: ");
        yearOfManufacture = sc.nextInt();

        System.out.print("Nhap cong suat: ");
        power = sc.nextDouble();
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Nha san xuat: " + manufacturer);
        System.out.println("Nam san xuat: " + yearOfManufacture);
        System.out.println("Cong suat: " + power);
    }
}
