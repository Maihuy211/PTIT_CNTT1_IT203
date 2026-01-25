import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số ngày nhập trễ: ");
        int n = sc.nextInt();

        System.out.println("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double moneyFine = n * m * 5000;
        System.out.printf("Tiền phạt gốc: %.2f VNĐ\n", moneyFine);

        if (n > 7 && m >= 3) {
            moneyFine = moneyFine * 1.2;
        }

        System.out.printf("Tiền phạt ngay sau khi điều chỉnh: %.2f VNĐ\n", moneyFine);

        boolean lockCard = moneyFine > 50000;
        System.out.println("Yêu cầu khoá thẻ: " + lockCard);
    }
}
