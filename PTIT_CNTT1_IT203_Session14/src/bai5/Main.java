package bai5;

import java.time.LocalTime;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Patient> queue = new TreeSet<>();
        // Thêm bệnh nhân
        queue.add(new Patient("Bệnh nhân A", 3, LocalTime.of(8, 0)));
        queue.add(new Patient("Bệnh nhân B", 1, LocalTime.of(8, 15)));
        queue.add(new Patient("Bệnh nhân C", 1, LocalTime.of(8, 5)));
        queue.add(new Patient("Bệnh nhân D", 2, LocalTime.of(8, 10)));

        // In thứ tự xử lý
        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}