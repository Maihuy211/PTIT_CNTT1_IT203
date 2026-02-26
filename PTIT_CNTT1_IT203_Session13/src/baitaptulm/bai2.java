package baitaptulm;

import java.util.ArrayList;
import java.util.Random;

public class bai2 {
    public static void main(String[] args) {
        int n = 1000;
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rd.nextInt(1000));
        }
        System.out.println("Danh sách: " + list);

        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 2) {
                continue;
            }
            int found = -1;
            for (int j = 2; j <= Math.sqrt(list.get(i)); j++) {
                if (list.get(i) % j == 0) {
                    found = 0;
                    break;
                }
            }
            if (found == -1) {
                prime.add(list.get(i));
            }
        }
        System.out.println("Danh sách số nguyên tố:" + prime);
    }
}
