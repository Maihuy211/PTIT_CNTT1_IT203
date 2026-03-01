package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("B01", "Java Core", "Nguyen Van A", "NXB Tre", 2020, 350, 120000));
        list.add(new Book("B02", "Data Structure", "Tran Van B", "NXB GD", 2018, 500, 150000));
        list.add(new Book("B03", "Algorithm", "Le Van C", "NXB KHTN", 2022, 420, 180000));
        list.add(new Book("B04", "Web Programming", "Pham Van D", "NXB Lao Dong", 2019, 300, 100000));

        System.out.println("Danh sách ban đầu:");
        printList(list);

        // Tăng dần theo tên sách
        Collections.sort(list, (b1, b2) -> b1.getTenSach().compareTo(b2.getTenSach()));
        System.out.println("Tăng dần theo tên sách:");
        printList(list);

        // Giảm dần theo giá tiền (dùng Comparable)
        Collections.sort(list);
        System.out.println("Giảm dần theo giá tiền:");
        printList(list);

        // Tăng dần theo số trang
        Collections.sort(list, (b1, b2) -> b1.getSoTrang() - b2.getSoTrang());
        System.out.println("Tăng dần theo số trang:");
        printList(list);

        // Giảm dần theo năm xuất bản
        Collections.sort(list, (b1, b2) -> b2.getNamXuatBan() - b1.getNamXuatBan());
        System.out.println("Giảm dần theo năm xuất bản:");
        printList(list);
    }

    public static void printList(ArrayList<Book> list) {
        for (Book b : list) {
            System.out.println(b);
        }
    }
}