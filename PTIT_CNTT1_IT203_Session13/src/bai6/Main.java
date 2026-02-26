package bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Medicine> medicineList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // 1. Thêm thuốc
    public static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getDrugId().equals(id)) {
                System.out.print("Nhập số lượng thêm: ");
                int addQty = Integer.parseInt(sc.nextLine());
                medicineList.get(i).setQuantity(
                        medicineList.get(i).getQuantity() + addQty
                );
                System.out.println("Đã cộng dồn số lượng.");
                return;
            }
        }
        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Đã thêm thuốc vào đơn.");
    }
    // 2. Điều chỉnh số lượng
    public static void updateQuantity() {
        System.out.print("Nhập mã thuốc cần chỉnh: ");
        String id = sc.nextLine();

        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getDrugId().equals(id)) {

                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    medicineList.remove(i);
                    System.out.println("Thuốc đã bị xóa.");
                } else {
                    medicineList.get(i).setQuantity(newQty);
                    System.out.println("Đã cập nhật số lượng.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc.");
    }

    // 3. Xóa thuốc
    public static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getDrugId().equals(id)) {
                medicineList.remove(i);
                System.out.println("Đã xóa thuốc.");
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc.");
    }
    // 4. In hóa đơn
    public static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }
        double total = 0;
        System.out.println("Mã | Tên | Giá | SL | Thành tiền");

        for (int i = 0; i < medicineList.size(); i++) {
            System.out.println(medicineList.get(i));
            total += medicineList.get(i).getTotal();
        }
        System.out.println("TỔNG TIỀN: " + total + " VNĐ");
        medicineList.clear();
        System.out.println("Đã hoàn tất đơn.");
    }

    // 5. Tìm thuốc giá rẻ
    public static void findCheapMedicine() {
        int found = -1;
        for (int i = 0; i < medicineList.size(); i++) {
            if (medicineList.get(i).getUnitPrice() < 50000) {
                System.out.println(medicineList.get(i));
                found = 0;
            }
        }
        if (found == -1) {
            System.out.println("Không có thuốc dưới 50.000.");
        }
    }
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Thêm thuốc");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }
}