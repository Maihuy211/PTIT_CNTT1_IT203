package bai1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    //Set: Là tập hợp không cho phép phần tử trùng lặp.
    //Nếu thêm dữ liệu giống nhau, phần tử đó sẽ không được lưu thêm lần nữa.
    //HashSet:
    //Không trùng lặp
    //Không đảm bảo thứ tự thêm vào (thứ tự có thể thay đổi khi in ra)
    //LinkedHashSet:
    //Không trùng lặp
    //Giữ nguyên thứ tự phần tử theo lúc được thêm vào
    public static void main(String[] args) {

        Set<String> patientList = new LinkedHashSet<>();
        patientList.add("Nguyễn Văn A – Yên Bái");
        patientList.add("Trần Thị B – Thái Bình");
        patientList.add("Nguyễn Văn A – Yên Bái");
        patientList.add("Lê Văn C – Hưng Yên");

        System.out.println(patientList);

        System.out.println("Danh sách gọi khám:");
        for (String name : patientList) {
            System.out.println(name);
        }
    }
}