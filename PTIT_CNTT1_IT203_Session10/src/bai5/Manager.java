package bai5;

public class Manager extends Employee implements BonusCalculator {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }
}
