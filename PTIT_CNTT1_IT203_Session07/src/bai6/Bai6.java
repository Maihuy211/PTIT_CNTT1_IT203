package bai6;

public class Bai6 {

    public static void main(String[] args) {

        User user1 = new User(1, "admin", "123");
        User user2 = new User(2, "user", "abc");

        UserManager.addUser(user1);
        UserManager.addUser(user2);

        UserManager.displayUsers();

        System.out.println("\nKiểm tra đăng nhập:");

        System.out.println(UserManager.checkLogin("admin", "123") ? "Đúng tài khoản" : "Sai tài khoản hoặc mật khẩu");

        System.out.println(UserManager.checkLogin("admin", "1234") ? "Đúng tài khoản" : "Sai tài khoản hoặc mật khẩu" );
    }
}
