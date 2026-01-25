import  java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sách có (4 chữ số): ");
        int number = sc.nextInt();

        int thousands = number / 1000;
        int hundreds  = (number / 100) % 10;
        int dozens    = (number / 10) % 10;
        int units     = number % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int expectedDigit = sumOfFirstThreeNumber % 10;

        System.out.println("Chữ số kiểm tra kì vọng: " + expectedDigit);

        String result = (expectedDigit == units) ? "HỢP LỆ" : "SAI MÃ";
        System.out.println("Kết quả kiểm tra: " + result);
    }
}
