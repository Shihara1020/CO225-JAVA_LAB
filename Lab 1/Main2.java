import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Calculate Your Advance Personal Income Tax (APIT)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total monthly employment income (salary + allowances): Rs. ");
        int income = scanner.nextInt();
        scanner.close();

        double totalTax = 0.0;
        double tax = 0.0;

        System.out.println("\nTAX SLAB      RATE ( % )   TAX");
        System.out.println("Rs.0.00 - Rs.100000.00   0%     Rs.0.00");

        if (income > 100000) {
            int taxable = Math.min(income, 141667) - 100000;
            tax = taxable * 0.06;
            totalTax += tax;
            System.out.printf("Rs.100000.00 - Rs.%d.00   6%%     Rs.%.2f\n", Math.min(income, 141667), tax);
        }

        if (income > 141667) {
            int taxable = Math.min(income, 183333) - 141667;
            tax = taxable * 0.12;
            totalTax += tax;
            System.out.printf("Rs.141667.00 - Rs.%d.00  12%%     Rs.%.2f\n", Math.min(income, 183333), tax);
        }

        if (income > 183333) {
            int taxable = Math.min(income, 225000) - 183333;
            tax = taxable * 0.18;
            totalTax += tax;
            System.out.printf("Rs.183333.00 - Rs.%d.00  18%%     Rs.%.2f\n", Math.min(income, 225000), tax);
        }

        if (income > 225000) {
            int taxable = Math.min(income, 266667) - 225000;
            tax = taxable * 0.24;
            totalTax += tax;
            System.out.printf("Rs.225000.00 - Rs.%d.00  24%%     Rs.%.2f\n", Math.min(income, 266667), tax);
        }

        if (income > 266667) {
            int taxable = Math.min(income, 308333) - 266667;
            tax = taxable * 0.30;
            totalTax += tax;
            System.out.printf("Rs.266667.00 - Rs.%d.00  30%%     Rs.%.2f\n", Math.min(income, 308333), tax);
        }

        if (income > 308333) {
            int taxable = income - 308333;
            tax = taxable * 0.36;
            totalTax += tax;
            System.out.printf("Rs.308333.00 - Rs.%d.00  36%%     Rs.%.2f\n", income, tax);
        }

        double effectiveRate = totalTax / income * 100;
        double salaryAfterTax = income - totalTax;

        System.out.printf("\nTotal tax payable: Rs.%.2f\n", totalTax);
        System.out.printf("Effective tax rate: %.2f%%\n", effectiveRate);
        System.out.printf("Salary after tax: Rs.%.2f\n", salaryAfterTax);
    }
}
