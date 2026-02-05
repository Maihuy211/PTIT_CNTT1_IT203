package bai3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phong ban: " + department);
    }
}
