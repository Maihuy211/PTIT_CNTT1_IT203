package bai6;

class UserManager {

    private static User[] users = new User[100];
    private static int totalUsers = 0;

    public static void addUser(User user) {
        if (user != null && totalUsers < users.length) {
            users[totalUsers] = user;
            totalUsers++;
        }
    }

    public static boolean checkLogin(String username, String password) {
        for (int i = 0; i < totalUsers; i++) {
            if (users[i].getUsername().equals(username)
                    && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void displayUsers() {
        System.out.println("Danh sách user hiện tại:");
        for (int i = 0; i < totalUsers; i++) {
            System.out.println((i + 1) + ". " + users[i]);
        }
    }
}