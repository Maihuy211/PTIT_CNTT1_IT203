package cau2;

import java.util.Scanner;

public class Phan1_C2 {
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
        int result = -1;
        for (int i = 0; i < n/2; i++) {
            if(arr[i] == arr[n - 1 - i]){
                result = 0;
            }
        }
        if(result == -1){
            System.out.println("Mảng không đối xứng");
        }else{
            System.out.println("Mảng đối xứng");
        }
    }
}
