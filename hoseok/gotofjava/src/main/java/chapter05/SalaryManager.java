package chapter05;

public class SalaryManager {

    public double getMonthlySalary(int yearlySalary) {
        double tax = calculateTax(yearlySalary) + calculateNationalPension(yearlySalary)
                + calculateHealthInsurance(yearlySalary);
        yearlySalary -= tax;
        return yearlySalary / 12.0;
    }

    private double calculateTax(double monthSalary) {
        System.out.println("tax : " + (monthSalary * 0.125));
        return monthSalary * 0.125;
    }

    private double calculateNationalPension(double monthSalary) {
        System.out.println("national pension : " + (monthSalary * 0.081));
        return monthSalary * 0.081;
    }

    private double calculateHealthInsurance(double monthSalary) {
        System.out.println("health insurance : " + (monthSalary * 0.135));
        return monthSalary * 0.135;
    }

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary(20000000));
    }
}
