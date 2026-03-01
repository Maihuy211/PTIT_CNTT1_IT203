package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<String> disease = new ArrayList<>();
        disease.add("Cúm A");
        disease.add("Sốt xuất huyết");
        disease.add("Cúm A");
        disease.add("Covid-19");
        disease.add("Cúm A");
        disease.add("Sốt xuất huyết");

        TreeMap<String , Integer> count = new TreeMap<>();
        for (String map: disease){
            if(count.containsKey(map)){
                count.put(map, count.get(map) + 1);
            }else{
                count.put(map,1);
            }
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
