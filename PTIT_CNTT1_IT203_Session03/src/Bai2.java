import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(search)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Conan", "Doraemon", "Dragon Ball", "Naruto", "One Piece"};
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int index = searchBooks(books,search);

        if(index != -1){
            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + index);
        }else{
            System.out.println("Sách không tồn tại trong thư viện");
        }
    }
}
