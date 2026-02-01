public class Book {
    public String bookId;
    public String title;
    public String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("\nMã sách: " + bookId);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lập trình Java", "Nguyễn Văn A");
        Book b2 = new Book("B02", "Cấu trúc dữ liệu", "Trần Thị B");

        b1.displayBook();
        b2.displayBook();
    }
}
