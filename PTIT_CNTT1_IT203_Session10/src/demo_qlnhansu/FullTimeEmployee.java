package demo_qlnhansu;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public FullTimeEmployee(String id, String name, int age, double basicSalary, double bonus) {
        super(id, name, age);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập lương cơ bản: ");
        basicSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lương thưởng: ");
        bonus = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("---- Full Time ----");
        super.display();
        System.out.println("Lương cơ bản: " + basicSalary);
        System.out.println("Thưởng: " + bonus);
        System.out.println("Tổng lương: " + getSalary());
    }

    @Override
    public double getSalary() {
        return basicSalary + bonus;
    }
}
