import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.println("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.println("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.println("Nhập giá tiền: ");
        double price = sc.nextDouble();

        System.out.println("Sách còn không? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;

        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + bookNameUpper);
        System.out.printf("Giá tiền: %.2f\n", price);
        System.out.println("Tuổi thọ sách: " + bookAge);
        System.out.println("Tình trạng: " + status);
    }
}
