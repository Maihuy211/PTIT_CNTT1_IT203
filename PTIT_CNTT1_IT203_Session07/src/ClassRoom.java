public class ClassRoom {

    private static double classFund = 0;
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void payFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }
    public static double getClassFund() {
        return classFund;
    }

    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Huy");
        ClassRoom sv2 = new ClassRoom("Hoàng");
        ClassRoom sv3 = new ClassRoom("Đức");

        sv1.payFund(100000);
        sv2.payFund(150000);
        sv3.payFund(200000);

        System.out.println("\nTổng quỹ lớp hiện tại: " + ClassRoom.getClassFund() + " VNĐ");
    }
}
