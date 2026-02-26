package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonPatients {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            if (listB.contains(listA.get(i)) && !result.contains(listA.get(i))) {
                result.add(listA.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        //Trường hợp 1 (Integer):
        List<Integer> khoaNoi1 = new ArrayList<>();
        khoaNoi1.add(101);
        khoaNoi1.add(102);
        khoaNoi1.add(105);

        List<Integer> khoaNgoai1 = new ArrayList<>();
        khoaNgoai1.add(102);
        khoaNgoai1.add(105);
        khoaNgoai1.add(108);

        List<Integer> commonInt = findCommonPatients(khoaNoi1, khoaNgoai1);
        System.out.println("Test Case 1 Output: " + commonInt);

        //Trường hợp 2 (String):
        List<String> khoaNoi2 = new ArrayList<>();
        khoaNoi2.add("DN01");
        khoaNoi2.add("DN02");
        khoaNoi2.add("DN03");

        List<String> khoaNgoai2 = new ArrayList<>();
        khoaNgoai2.add("DN02");
        khoaNgoai2.add("DN04");

        List<String> commonString = findCommonPatients(khoaNoi2, khoaNgoai2);
        System.out.println("Test Case 2 Output: " + commonString);
    }
}

