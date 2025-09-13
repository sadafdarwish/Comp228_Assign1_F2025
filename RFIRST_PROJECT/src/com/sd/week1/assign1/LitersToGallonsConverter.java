package com.sd.week1.assign1;


import java.util.Scanner;

public class LitersToGallonsConverter {
    private static final double LITER_TO_GALLON = 0.264172;

    public void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        double gallons = liters * LITER_TO_GALLON;
        System.out.printf("%.2f liters = %.2f gallons%n", liters, gallons);
    }
}
