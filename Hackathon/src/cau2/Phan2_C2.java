package cau2;

import java.util.Scanner;

public class Phan2_C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        if(n < 0 || n > 100){
            System.out.println("Số lượng phần tử không hợp lệ");
            return;
        }
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countMax = 0;
        int num = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > countMax) {
                countMax = count;
                num = arr[i];
            }
        }
        System.out.println("Số xuất iện nhiều nhất: " + num);
        System.out.println("Số lần xuất hiện: " + countMax);
    }
}
