package bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Patient> patientList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // Tiếp nhận bệnh nhân
    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        for (int i = 0; i < patientList.size(); i++) {
            if(patientList.get(i).getId().equals(id)){
                System.out.println("ID Không được trùng");
                return;
            }
        }
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công");
    }
    // Cập nhật chuẩn đoán
    public static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                patientList.get(i).setDiagnosis(newDiagnosis);
                System.out.println("Chuẩn đoán được cập nhật");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã cho");
    }
    // Xuất viện
    public static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId().equals(id)) {
                patientList.remove(i);
                System.out.println("Đã xuất viện thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho");
    }
    // sắp xếp
    public static void sortPatients() {
        Collections.sort(patientList, (p1, p2) -> {
            if (p2.getAge() != p1.getAge()) {
                return p2.getAge() - p1.getAge(); // tuổi giảm dần
            }
            return p1.getFullName().compareTo(p2.getFullName()); // tên tăng dần
        });
        System.out.println("Danh sách bệnh nhân đã được sắp xếp");
    }
    // Hiện thị bệnh nhân
    public static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("===Danh sách bệnh nhân===");
        for (int i = 0; i < patientList.size(); i++) {
            System.out.println(patientList.get(i));
        }
    }
    public static void main(String[] args) {
        int choice = 0;
        do{
            System.out.println("---MENU---");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chuẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bênh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (choice != 6);
    }
}
