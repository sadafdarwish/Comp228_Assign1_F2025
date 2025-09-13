package com.sd.week1.assign1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Grade Calculation");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Liters to Gallons");
            System.out.println("4. CAD to USD");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.next(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1 -> new GradeCalculation().calculateGrade();
                case 2 -> new MilesToKmConverter().convert();
                case 3 -> new LitersToGallonsConverter().convert();
                case 4 -> new CadToUsdConverter().convert();
                case 5 -> System.out.println("Exiting program... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (true);
    }
}
