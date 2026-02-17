package bai2;

class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " - Cách di chuyển: Di chuyển bằng sức người");
    }
}
