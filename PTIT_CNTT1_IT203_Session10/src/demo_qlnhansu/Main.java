package demo_qlnhansu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("===== QUẢN LÝ NHÂN SỰ =====");
            System.out.println("1. Thêm nhân sự");
            System.out.println("2. Hiển thị danh sách nhân sự");
            System.out.println("3. Tìm kiếm nhân sự theo mã");
            System.out.println("4. Xoá thông tin nhân sự theo mã");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Mời bạn nhâp lại");
            }

        }while (choice != 0);
    }
}
