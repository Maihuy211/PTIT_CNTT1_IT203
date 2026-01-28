import java.util.Scanner;
import java.util.regex.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cardID: ");
        String cardID = sc.nextLine().trim();

        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("Thiếu tiền tố");
            } else if (cardID.length() != 11) {
                System.out.println("Độ dài mã thẻ không hợp lệ");
            } else if (!cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Năm không hợp lệ");
            } else if (!cardID.substring(6).matches("\\d{5}")) {
                System.out.println("5 số cuối không hợp lệ");
            } else {
                System.out.println("Mã thẻ không đúng định dạng");
            }
        }
    }
}
