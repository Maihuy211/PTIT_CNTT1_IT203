package demo_qlnhansu;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name, int age, int workingHours, double hourlyRate) {
        super(id, name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giờ làm việc: ");
        workingHours = sc.nextInt();
        System.out.println("Mức lương mỗi giờ làm việc: ");
        hourlyRate = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("------PartTime-------");
        super.display();
        System.out.println("Số giờ làm việc: " + workingHours);
        System.out.println("Mức lương mỗi giờ làm việc: " + hourlyRate);
        System.out.println("Tổng lương: " + getSalary());

    }

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }
}
