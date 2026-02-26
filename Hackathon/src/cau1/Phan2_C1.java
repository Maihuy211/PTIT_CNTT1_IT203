package cau1;

import java.util.Scanner;

public class Phan2_C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi ngẫu nhiên: ");
        String input = sc.nextLine();
        if (input.length() == 0) {
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }
        int result = -1;
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                result = 0;
                break;
            }
        }
        if (result == -1) {
            System.out.println("Chuoi khong doi xung");
        } else {
            System.out.println("Chuoi doi xung");
        }
    }
}