package bai3;

public class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayInfo() {
        System.out.println("Ten nhan vien: " + name);
        System.out.println("Luong co ban: " + basicSalary);
    }
}
