package chapter06;

public class InterestManager {

    public double getInterestRate(int day) {
        if (day >= 1 && day <= 90) {
            return 0.05;
        } else if (day >= 91 && day <= 180) {
            return 0.01;
        } else if (day >= 181 && day <= 364) {
            return 0.02;
        } else {
            return 0.056;
        }
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        return amount + amount * interestRate;
    }

    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

        long amount = 0;
        int dayCount = 0;
        for (int i = 1; i <= 365; i += 10) {
            dayCount++;
            amount += 1000000;
        }

        System.out.println(interestManager.calculateAmount(dayCount, amount));
    }
}
