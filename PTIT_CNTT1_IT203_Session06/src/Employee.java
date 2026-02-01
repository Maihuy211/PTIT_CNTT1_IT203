public class Employee {
    public String employeeID;
    public String fullName;
    public double salary;

    public Employee(){
        this.employeeID = "";
        this.fullName = "";
        this.salary = 0;
    }

    public Employee(String employeeID, String fullName) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salary = 0;
    }

    public Employee(String employeeID, String fullName, double salary) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salary = salary;
    }

    public void  displayEmployee(){
        System.out.println("\nMã NV: " + employeeID);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Lương: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyen Van A");
        Employee e3 = new Employee("NV02", "Tran Thi B", 1500);

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
    }
}
