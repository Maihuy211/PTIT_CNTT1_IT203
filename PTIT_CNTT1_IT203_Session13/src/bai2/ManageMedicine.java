package bai2;

import java.util.ArrayList;
import java.util.Collections;

public class ManageMedicine {
    public static void main(String[] args) {
        ArrayList<String> medicine = new ArrayList<>();
        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");

        System.out.println("Input: " + medicine);

        ArrayList<String> duplicate = new ArrayList<>();

        for (int i = 0; i < medicine.size(); i++) {
            if(!duplicate.contains(medicine.get(i))) {
                duplicate.add(medicine.get(i));
            }
        }
        Collections.sort(duplicate);

        System.out.println("Output: " + duplicate);
    }
}
