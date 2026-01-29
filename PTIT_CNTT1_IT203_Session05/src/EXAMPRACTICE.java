import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EXAMPRACTICE {

    public static void displayStudentID(String[] studentID, int size) {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("STT: " + (i + 1) + " - MSSV: " + studentID[i]);
        }
    }

    public static boolean checkMSSV(String id) {
        String regex = "^B\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static int addStudentID(String[] studentID, int size, int capacity, Scanner sc) {
        if (size >= capacity) {
            System.out.println("Danh sách đã đầy");
            return size;
        }

        String newID;
        while (true) {
            System.out.print("Nhập mã sinh viên mới: ");
            newID = sc.nextLine();
            if (checkMSSV(newID)) {
                break;
            }
            System.out.println("MSSV không hợp lệ, vui lòng nhập lại");
        }

        studentID[size] = newID;
        System.out.println("Thêm thành công");
        return size + 1;
    }

    public static void updateStudentID(String[] studentID, int size, int indexID, Scanner sc) {
        int index = indexID - 1;
        if (index < 0 || index >= size) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }

        String newID;
        while (true) {
            System.out.print("Nhập mã sinh viên mới: ");
            newID = sc.nextLine();
            if (checkMSSV(newID)) {
                break;
            }
            System.out.println("MSSV không hợp lệ, vui lòng nhập lại");
        }

        studentID[index] = newID;
        System.out.println("Cập nhật thành công");
    }

    public static int deleteStudentID(String[] studentID, int size, String deleteID) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (studentID[i].equals(deleteID)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy mã sinh viên cần xoá");
            return size;
        }

        for (int i = index; i < size - 1; i++) {
            studentID[i] = studentID[i + 1];
        }
        studentID[size - 1] = null;

        System.out.println("Xoá thành công");
        return size - 1;
    }

    public static void searchStudentID(String[] studentID, int size, String search) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (studentID[i].toLowerCase().trim().equals(search)) {
                System.out.println(studentID[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 100;
        String[] studentID = new String[capacity];
        int size = 0;
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayStudentID(studentID, size);
                    break;
                case 2:
                    size = addStudentID(studentID, size, capacity, sc);
                    break;
                case 3:
                    System.out.print("Nhập vị trí cần cập nhật: ");
                    int indexId = sc.nextInt();
                    sc.nextLine();
                    updateStudentID(studentID, size, indexId, sc);
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xoá: ");
                    String deleteID = sc.nextLine();
                    size = deleteStudentID(studentID, size, deleteID);
                    break;
                case 5:
                    System.out.print("Nhập chuỗi cần tìm: ");
                    String search = sc.nextLine().toLowerCase().trim();
                    searchStudentID(studentID, size, search);
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 0);
    }
}
