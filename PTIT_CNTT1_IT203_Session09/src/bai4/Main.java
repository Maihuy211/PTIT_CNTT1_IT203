package bai4;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.run();
        }
    }
}
