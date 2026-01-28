public class Bai2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, kệ: A1-102, tình trạng mới ";
        System.out.println(description);

        if (description.contains("kệ:")) {
            int start = description.indexOf("kệ:") + 5;
            int end = description.indexOf(",", start);

            String result = description.substring(start, end);
            System.out.println("Vị trí tìm thấy: " + result);
        }

        String newDescription = description.replace("kệ:", "Vị trí lưu trữ:");
        System.out.println("Mô tả mới: " + newDescription);
    }
}
