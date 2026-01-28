import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tên sách: ");
        String title = sc.nextLine().toUpperCase().trim();

        System.out.print("Tên Tác giả: " );

        String author = sc.nextLine().toLowerCase().trim();

        String[] words = author.split(" ");
        String result = "";

        for (int i = 0; i < words.length ; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        author = result;
        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}
