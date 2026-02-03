import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students;
    static int n = 0;
    public static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        sc.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Nhập mã SV (SVxxx): ");
                id = sc.nextLine();

                if (id.startsWith("SV") && id.length() == 5) {
                    break;
                }
                System.out.println("Mã sinh viên không hợp lệ!");
            }

            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    public static void showStudents() {
        if (students == null || n == 0) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Mã SV   : " + students[i].getId());
            System.out.println("Họ tên  : " + students[i].getName());
            System.out.println("Điểm TB : " + students[i].getScore());
            System.out.println("Học lực : " + students[i].getRank());
            System.out.println("--------------------------");
        }
    }

    public static void searchByRank() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có học lực: " + rank);
        }
    }

    public static void sortByScoreDesc() {
        if (students == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp theo học lực giảm dần!");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchByRank();
                    break;
                case 4:
                    sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (choice != 5);
    }
}
