public class Student {

    private final String id;
    private final String name;
    private static int totalStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + id );
        System.out.println("Name: " + name);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

    public class Main {
        public static void main(String[] args) {

            Student s1 = new Student("SV001", "mai van huy");
            Student s2 = new Student("SV002", "dinh trong an");
            Student s3 = new Student("SV003", "dinh dinh thanh");

            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();

            Student.displayTotalStudent();
        }
    }

}
