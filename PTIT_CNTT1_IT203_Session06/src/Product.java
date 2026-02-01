public class Product {
    private String productID;
    private String productName;
    private double price;

    public Product (String productID , String productName, double price){
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price > 0){
           this.price = price;
        }else{
            System.out.println("Không hợp lệ");
        }
    }
    public void displayProduct() {
        System.out.println("\nMã SP: " + productID);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product("SP01", "Laptop", 1500);

        p.displayProduct();

        System.out.println("\nThử set giá = -100");
        p.setPrice(-100);

        p.displayProduct();
    }
}

