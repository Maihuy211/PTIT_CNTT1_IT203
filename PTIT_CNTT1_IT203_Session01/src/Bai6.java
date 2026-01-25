import  java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("NHập số thứ tự của hệ thống: ");
        int stt = sc.nextInt();

        int shelf = (stt - 1) / 25 + 1;
        int pos = (stt - 1) % 25 + 1;

        String area = (shelf <= 10) ?  "Khu Cận (Gần cửa)" : "Khu Viễn (Xa cửa)";

        System.out.println("---  THÔNG TIN VỊ TRÍ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelf + "- Vị trí " + pos);
        System.out.println("Phân khu: " + area);
    }
}
