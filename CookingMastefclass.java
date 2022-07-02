package com.company;

import java.util.Scanner;

public class CookingMastefclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double students = Double.parseDouble(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceOneEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());
        double freePackages = Math.floor(students/5);
        double total = (priceApron * Math.ceil(students * 1.2)) + ((priceOneEgg * 10) * students) + (priceFlour *(students-freePackages));
        if(total<=budget){
            System.out.printf("Items purchased for %.2f$.", total);
        }
        else{
            double diff = Math.abs(total - budget);
            System.out.printf("%.2f$ more needed.", diff);
        }
    }
}
