package C05;

public class SalaryManager {
    public double getMonthSalary(int yearlySalary) {
        // 실제로 돈계산을 할때는 BigDecimal을 사용할 것!
        double withoutTax = (double) yearlySalary / 12.0;
        return calculateTax(withoutTax);
    }

    public double calculateTax(double monthSalary) {
        return monthSalary - monthSalary * 0.125 - calculateNationalPension(monthSalary) - calculateHealthInsurance(monthSalary);
    }

    public double calculateNationalPension(double monthSalary) {
        return monthSalary * 0.081;
    }

    public double calculateHealthInsurance(double monthSalary) {
        return monthSalary * 0.135;
    }
}
