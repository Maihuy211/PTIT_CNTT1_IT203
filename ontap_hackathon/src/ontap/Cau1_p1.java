package ontap;
import java.util.Scanner;
    public class Cau1_p1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine().toLowerCase();

            String nguyenAm = "";
            String phuAm = "";

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        nguyenAm += c;
                    } else {
                        phuAm += c;
                    }
                }
            }
            System.out.println("Nguyên âm: " + nguyenAm);
            System.out.println("Phụ âm: " + phuAm);
        }
    }

