/**
 * Student Name: Ryley Carlson
 * CSC320 Module 2 Critical Thinking Assignment 2 - Option #2
 * Program: Grocery Bill Calculator
 * Description: This program calculates the total monthly grocery bill and
 * the average weekly grocery bill based on user input for four weeks of grocery bills.
 *  It also applies a coupon discount to calculate the adjusted totals and averages.
 *  The results are displayed in a formatted currency style.
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GroceryBillCalculator {

    public static void main(String[] args) {
        NumberFormat currencyFormat;
        double couponAmount;
        double billWeek1, billWeek2, billWeek3, billWeek4;
        double totalMonthly;
        double avgWeekly;
        double totalMonthlyCoupon;
        double avgWeeklyCoupon;
        
        try (Scanner scanner = new Scanner(System.in)) {
            currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
            
            System.out.print("Enter the coupon amount as a decimal (example, .10): ");
            couponAmount = scanner.nextDouble();
            
            if (couponAmount <= 0 || couponAmount > 1.0) {
                couponAmount = 0.10;
            }
            
            System.out.print("Enter Week 1 grocery bill: ");
            billWeek1 = scanner.nextDouble();
            System.out.print("Enter Week 2 grocery bill: ");
            billWeek2 = scanner.nextDouble();
            System.out.print("Enter Week 3 grocery bill: ");
            billWeek3 = scanner.nextDouble();
            System.out.print("Enter Week 4 grocery bill: ");
            billWeek4 = scanner.nextDouble();
        }

        // Calculate the monthly and weekly average for groceries
        totalMonthly = billWeek1 + billWeek2 + billWeek3 + billWeek4;
        avgWeekly = totalMonthly / 4.0;
        totalMonthlyCoupon = totalMonthly * (1 - couponAmount);
        avgWeeklyCoupon = totalMonthlyCoupon / 4.0;

        // Display monthly total and weekly average without the coupon
        System.out.println("\n--- Results Without Coupon ---");
        System.out.println("Monthly Total: " + currencyFormat.format(totalMonthly));
        System.out.println("Weekly Average: " + currencyFormat.format(avgWeekly));

        // Display monthly total and weekly average with the coupon
        System.out.println("\n--- Results With Coupon ---");
        System.out.println("Monthly Total: " + currencyFormat.format(totalMonthlyCoupon));
        System.out.println("Weekly Average: " + currencyFormat.format(avgWeeklyCoupon));
    }
}

