package demo_Ss09;

import java.util.Scanner;

public class Animal {
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private int averageLifeExpectancy;

    // Constructor không tham số
    public Animal() {
    }

    // Constructor có tham số
    public Animal(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    // Getter & Setter
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public void setAverageLifeExpectancy(int averageLifeExpectancy) {
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    // Nhập dữ liệu
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên động vật: ");
        animalName = sc.nextLine();

        System.out.print("Nhập số chân: ");
        numberOfLegs = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập màu lông: ");
        furColor = sc.nextLine();

        System.out.print("Nhập tuổi thọ trung bình: ");
        averageLifeExpectancy = sc.nextInt();
        sc.nextLine();
    }

    // Hiển thị dữ liệu
    public void display() {
        System.out.println("Tên động vật: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ trung bình: " + averageLifeExpectancy);
    }
}
