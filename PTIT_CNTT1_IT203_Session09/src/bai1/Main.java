package bai1;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person p = new Person("Nguyen Van A", 30);
        p.displayInfo();

        // Tạo đối tượng Student
        Student s = new Student("Mai Van Huy =", 20, "SV001", 8.5);
        s.displayInfo();
    }
}
