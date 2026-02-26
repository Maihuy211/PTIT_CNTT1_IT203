package bai1;

import java.util.ArrayList;
import java.util.Iterator;

public class ManageTemperature {
    public static void main(String[] args) {
        ArrayList<Double> temperature = new ArrayList<>();
        temperature.add(36.5);
        temperature.add(40.2);
        temperature.add(37.0);
        temperature.add(12.5);
        temperature.add(39.8);
        temperature.add(99.9);
        temperature.add(36.8);

        System.out.println("Danh sách ban đầu: " + temperature);

        Iterator<Double> iterator = temperature.iterator();

        while (iterator.hasNext()){
            Double element = iterator.next();
            if (element < 34.0 || element > 42.0){
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temperature);

        double sum = 0;
        for (int i = 0; i < temperature.size(); i++) {
            sum += temperature.get(i);
        }
        double avg = sum /  temperature.size();

        System.out.println("Nhiệt đô trung bình: " + avg);
    }
}
