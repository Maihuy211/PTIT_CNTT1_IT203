package demo_qlnhansu;

import java.util.Scanner;

public abstract class Employee implements IEmployee {
    private String id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        id = sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi:");
        age = sc.nextInt();
    }

    @Override
    public void display() {
        System.out.println("Mã nhân sự: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    @Override
    public abstract double getSalary();
}
