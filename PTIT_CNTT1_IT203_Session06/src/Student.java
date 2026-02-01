public class Student {
    public String studentId;
    public String fullName;
    public int dateYear;
    public double pointAvg;

    public Student(String studentId, String fullName, int dateYear, double pointAvg) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateYear = dateYear;
        this.pointAvg = pointAvg;
    }

    public void displayStudent() {
        System.out.println("\nMã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + dateYear);
        System.out.println("Điểm trung bình: " + pointAvg);
    }

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Van A", 2002, 8.6);
        Student sv2 = new Student("SV002", "Nguyen Van B", 2005, 9.0);
        Student sv3 = new Student("SV003", "Tran Thi C", 2007, 8.1);

        sv1.displayStudent();
        sv2.displayStudent();
        sv3.displayStudent();
    }
}
