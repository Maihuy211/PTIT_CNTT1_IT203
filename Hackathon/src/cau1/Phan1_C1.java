package cau1;

import java.util.Scanner;

public class Phan1_C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ngẫu nhiên ");
        String input = sc.nextLine();
        if (input.length() == 0) {
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }
        int countString = 0;
        int countChar = 0;
        int countNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                countString++;
            }
            else if (c >= '0' && c <= '9') {
                countNumber++;
            }
            else {
                countChar++;
            }
        }
        System.out.println("Số chữ cái: " + countString);
        System.out.println("Số chữ số: " + countNumber);
        System.out.println("Ký tự đặc biệt: " + countChar);
    }
}