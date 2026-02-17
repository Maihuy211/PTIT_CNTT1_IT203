package bai3;

public class Duck extends Animal implements Swimmable, Flyable {
    public Duck() {
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " bơi");
    }
    @Override
    public void fly() {
        System.out.println(getName() + " bay");
    }
}
