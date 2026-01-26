import  java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap so ngay tre thu %d: ", i);
            int dayLate = sc.nextInt();
            total = total + dayLate;
        }

        int moneyTotal = total * 5000;
        System.out.println("===> Tong tien phat: " + moneyTotal + " VND");
    }
}
