package bai1;

public class Student extends Person {
    private String studentId;
    private double averageScore;

    public Student(String name, int age, String studentId, double averageScore) {
        super(name, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + averageScore);
    }
}
