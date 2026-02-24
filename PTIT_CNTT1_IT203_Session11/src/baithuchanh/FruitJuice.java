package baithuchanh;

public class FruitJuice extends Drink implements IMixable {
    private int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return getPrice() - (getPrice() * discountPercent / 100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}