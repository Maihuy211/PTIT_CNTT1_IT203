package bai5;

public class OfficeEmployee extends Employee {
    int baseSalary;

    OfficeEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    int calculateSalary() {
        return baseSalary;
    }
}
