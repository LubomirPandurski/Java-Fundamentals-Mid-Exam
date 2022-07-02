package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class CofeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffees = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int commandNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandNumber; i++) {
            String command = scanner.nextLine();
            String[] data = command.split(" ");
            switch (data[0]){
                case "Include":
                    coffees.add(data[1]);
                    break;
                case "Remove":
                    int size = Integer.parseInt(data[2]);
                    if(size>coffees.size()) {
                        break;
                    }
                    int numbersToRemove = Integer.parseInt(data[2]);
                    if(data[1].equals("first")){
                        for (int j = numbersToRemove - 1; j >=0; j--) {
                        coffees.remove(j);
                        }
                    }
                    else if(data[1].equals("last")){
                        for (int j = 0; j < numbersToRemove ; j++) {
                            coffees.remove(coffees.size() - 1);
                        }
                    }
                    break;
                case "Prefer":
                    int coffee1 = Integer.parseInt(data[1]);
                    int coffee2 = Integer.parseInt(data[2]);
                    if(coffee1<coffees.size() && coffee2<coffees.size() && coffee1!=coffee2){
                        Collections.swap(coffees, coffee1, coffee2);
                    }
                    else{
                        break;
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                        break;

            }
        }
        System.out.println("Coffees:");
        System.out.println(coffees.toString().replaceAll("[\\[\\],]", ""));
    }
}
