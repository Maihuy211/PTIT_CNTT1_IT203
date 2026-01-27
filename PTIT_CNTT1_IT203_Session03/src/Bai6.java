public class Bai6 {
    public static void sortArr(int[] arr){
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
    public static void mergeBooks(int[] a, int[] b) {

        //  Gộp 2 mảng vào temp
        int[] temp = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            temp[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            temp[k++] = b[i];
        }

        //Sắp xếp lại temp
        sortArr(temp);

        // Lọc phần tử trùng
        int[] result = new int[temp.length];
        int index = 0;

        result[index++] = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                result[index++] = temp[i];
            }
        }

        System.out.print("Kho tổng (đã gộp & lọc trùng): [");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        mergeBooks(arrayFirst, arraySecond);
    }
}
