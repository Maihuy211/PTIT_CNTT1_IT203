public class User {

    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password); // dùng setter để kiểm soát
        setEmail(email);       // dùng setter để kiểm soát
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Password không được rỗng");
            return;
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Email không hợp lệ");
            return;
        }
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("\nID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("password: " + "*".repeat(password.length()));
    }

    public class Main {
        public static void main(String[] args) {

            // Trường hợp đúng
            User user1 = new User(1, "admin", "123456", "admin@gmail.com");
            user1.displayInfo();


            // Email sai
            User user2 = new User(2, "user2", "abc123", "sai-email");
            user2.displayInfo();


            // Password rỗng
            User user3 = new User(3, "user3", "", "user3@gmail.com");
            user3.displayInfo();

            // Set lại dữ liệu sai
            user1.setEmail("email_sai");
            user1.setPassword("");
            user1.displayInfo();
        }
    }
}
