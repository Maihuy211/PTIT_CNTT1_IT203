package bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Patient> list = new ArrayList<>();
        list.add(new Patient("Huy", 30, "Tim mạch"));
        list.add(new Patient("An", 40, "Nội tiết"));
        list.add(new Patient("Thành", 25, "Tim mạch"));

        Map<String, List<Patient>> map = new HashMap<>();

        // Gom nhóm
        for (Patient p : list) {
            if (!map.containsKey(p.getDepartment())) {
                map.put(p.getDepartment(), new ArrayList<>());
            }
            map.get(p.getDepartment()).add(p);
        }

        // In kết quả
        for (String key : map.keySet()) {
            System.out.println("Khoa " + key + ": " + map.get(key));
        }

        // Tìm khoa đông nhất
        String maxDept = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key).size() > max) {
                max = map.get(key).size();
                maxDept = key;
            }
        }

        System.out.println("Khoa đông nhất: " + maxDept + " (" + max + " bệnh nhân)");
    }
}