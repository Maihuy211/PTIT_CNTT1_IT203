package demo_Ss09;

import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    // Constructor không tham số
    public Bird() {
        super();
    }

    // Constructor có tham số (dùng super)
    public Bird(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy,
                boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    // Getter & Setter
    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    // Override input
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.print("Có bay được không (true/false): ");
        isFly = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Tiếng hót: ");
        birdSound = sc.nextLine();
    }

    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Có bay được: " + isFly);
        System.out.println("Tiếng hót: " + birdSound);
    }
}

