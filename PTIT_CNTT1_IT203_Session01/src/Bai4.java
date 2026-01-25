import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá sách (USD - kiểu double): ");
        double usdPrice = sc.nextDouble();

        System.out.println("Nhap tỉ giá: ");
        float exchangeRate = sc.nextFloat();

        double total = usdPrice * exchangeRate;

        long roundedVndPrice = (long) total;

        System.out.println("Giá chính xác (số thực): " + total);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVndPrice);

    }
}
