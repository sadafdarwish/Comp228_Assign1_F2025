package com.sd.week1.assign1;


import java.util.Scanner;

public class MilesToKmConverter {
    public void convert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        double km = miles * 1.60934;
        System.out.printf("%.2f miles = %.2f km%n", miles, km);
    }
}
