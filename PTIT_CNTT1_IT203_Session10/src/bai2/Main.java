package bai2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("hyundai");
        Vehicle bicycle = new Bicycle("asama");

        car.move();
        bicycle.move();
    }
}
