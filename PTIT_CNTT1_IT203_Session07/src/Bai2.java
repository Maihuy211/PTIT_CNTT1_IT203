public class Bai2 {
    private String name;

    public static void main(String[] args) {

        // Bien nguyen thuy
        int x = 10;
        int y = x;
        y = 20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Bien tham chieu
        Bai2 obj1 = new Bai2();
        obj1.name = "Nguyen Van A";

        Bai2 obj2 = obj1;
        obj2.name = "Tran Van B";

        System.out.println("obj1 = " + obj1.name);
        System.out.println("obj2 = " + obj2.name);
    }
}
