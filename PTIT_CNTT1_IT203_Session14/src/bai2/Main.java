package bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,String> medicine = new HashMap<>();
        medicine.put("T01", "Paracetamol");
        medicine.put("T02", "Ibuprofen");
        medicine.put("T03", "Aspirin");
        medicine.put("T04", "Amoxicillin");
        medicine.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        String input = sc.nextLine();
        if(medicine.containsKey(input)){
            System.out.println(medicine.get(input));
        }else{
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
