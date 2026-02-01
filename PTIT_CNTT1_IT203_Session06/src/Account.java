public class Account {
    public String username;
    public String password;
    private String email;

    public Account(String username , String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setPassword(String newPass ){
        this.password = newPass;
        System.out.println("Đổi mật khẩu thành công");
    }

    public void displayAccount(){
        System.out.println("\nTên: " + username);
        System.out.println("password: " + "*".repeat(password.length()));
        System.out.println("email: " + email);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Huy", "huy@123" , "huy@gmail.com");
        Account acc2 = new Account("An", "an@123" , "an@gmail.com");

        acc1.setPassword("huy1@gmail.com");

        acc1.displayAccount();
        acc2.displayAccount();
    }
}
