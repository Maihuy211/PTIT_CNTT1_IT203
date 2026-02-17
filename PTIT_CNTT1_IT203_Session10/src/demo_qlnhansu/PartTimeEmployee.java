package demo_qlnhansu;

public class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }


}
