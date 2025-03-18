package Q_10;
import java.util.*;


public class Q_10 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double loanAmount;
    double annualInterestRate;
    double monthlyInterestRate;
    double monthlyPayment;
    double totalPayment;

    int MONTHS_IN_YEAR = 12;
    int numberOfPayments;
    int loanPeriod;

        System.out.println("Enter loan amount :");
        loanAmount = s.nextDouble();

        System.out.println("Enter annual interest rate :");
        annualInterestRate = s.nextDouble();

        System.out.println("Enter loan period in months :");
         loanPeriod= s.nextInt();

        monthlyInterestRate = annualInterestRate/100.0/MONTHS_IN_YEAR;
        numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment is :"+monthlyPayment);
        System.out.println("Total Payment is :"+totalPayment);
    s.close();
    }

}
