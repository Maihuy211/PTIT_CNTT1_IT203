package cau3;

import java.util.Scanner;

public class Main {
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
        System.out.print("K: ");
        int K = sc.nextInt();
        int result = 0;
        int found = -1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == K) {
                    found = i;
                    num1 = arr[i];
                    num2 = arr[j];
                    break;
                }
            }
        }
        if(found == -1){
            System.out.println("Không tồn tại cặp nào");
        }else{
            System.out.println("Cặp tim đc: " + num1+ " và " +num2);
        }
    }
}
