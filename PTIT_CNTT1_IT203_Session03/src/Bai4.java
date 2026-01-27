import java.util.Random;

public class Bai4 {
    public static void sortBooks(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(1000);
        }

        System.out.print("Trước khi sắp xếp: ");
        displayBooks(arr);
        System.out.println();
        System.out.print("Sau khi sắp xếp: ");
        sortBooks(arr);
        displayBooks(arr);
    }
}
