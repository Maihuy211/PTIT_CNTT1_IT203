package demo_Ss09;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    // Constructor không tham số
    public MamalAnimal() {
        super();
    }

    // Constructor có tham số (dùng super)
    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy,
                       String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    // Getter & Setter
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    // Override input
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.print("Kiểu thức ăn: ");
        foodType = sc.nextLine();

        System.out.print("Có sống với con người không (true/false): ");
        isLiveWithHuman = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Tiếng kêu: ");
        mamalSound = sc.nextLine();
    }

    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Kiểu thức ăn: " + foodType);
        System.out.println("Sống với con người: " + isLiveWithHuman);
        System.out.println("Tiếng kêu: " + mamalSound);
    }
}
