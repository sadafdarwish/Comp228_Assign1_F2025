package com.sd.week1.assign1;


import java.util.Scanner;

public class CadToUsdConverter {
    public void convert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CAD amount: ");
        double cad = sc.nextDouble();

        System.out.print("Enter today’s CAD to USD rate: ");
        double rate = sc.nextDouble();

        double usd = cad * rate;
        System.out.printf("%.2f CAD = %.2f USD%n", cad, usd);
    }
}
