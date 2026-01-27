import java.util.Scanner;

public class Bai1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        System.out.printf("Nhập mã số cho %d cuốn sách\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Sach thu %d: ",i + 1);
            books[i] = sc.nextInt();
        }
        return books;
    }

    public static void  displayLibraries(int[] arr){
        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();

        int[] library = addBookToLibraries(n);
        displayLibraries(library);

    }
}
