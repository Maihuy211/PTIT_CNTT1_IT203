package baitaptulm;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nation = new ArrayList<>();
        System.out.println("Nhập vào tên một quốc gia bất kì");
        System.out.println("Nhập số 0 để kết thúc");
        while (true) {
            String nationName = sc.nextLine();
            if (nationName.equals("0")) {
                break;
            }
            nation.add(nationName);
        }
        System.out.println("Danh sach quốc gia đã nhập: " + nation);
    }
}
