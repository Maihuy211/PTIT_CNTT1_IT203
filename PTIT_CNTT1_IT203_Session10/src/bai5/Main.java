package bai5;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new OfficeStaff("Lan", 8000000);
        Employee e2 = new Manager("Minh", 15000000, 5000000);

        e1.printSalary();
        e2.printSalary();
    }
}
