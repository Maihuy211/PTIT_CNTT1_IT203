package bai6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Mouse", 25),
                new Product("Keyboard", 45),
                new Product("Monitor", 300)
        };

        //  Anonymous Class - Sort theo giá tăng dần
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }

            /*
             Khi bắt buộc dùng Anonymous Class thay vì Lambda:

             - Khi cần thêm thuộc tính (field) bên trong class ẩn
             - Khi cần override nhiều method
             - Khi interface KHÔNG phải functional interface

             Lambda chỉ dùng được khi interface có đúng 1 abstract method.
            */
        });

        System.out.println("Sắp xếp theo giá tăng dần (Anonymous Class):");
        for (Product p : products) {
            System.out.println(p);
        }

        // Lambda Expression - Sort theo tên A-Z
        Arrays.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\nSắp xếp theo tên A-Z (Lambda):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
