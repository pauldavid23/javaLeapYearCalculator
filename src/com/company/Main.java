package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int theyear = 0;
        int theMOnth = 0;
        System.out.println("Enter year to determine leap year: ");
        if(scanner.hasNextInt()) {
            theyear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter month (1 to 12) to determine number of days: ");
            if (scanner.hasNextInt()) {
                theMOnth = scanner.nextInt();
                scanner.nextLine();
                getDaysinMonth(theMOnth,theyear);
                IsleapYearCalculator(theyear);
            } else {
                System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
    public static int IsleapYearCalculator(int year) {

        if (year%4==0 && (year%100!=0 || year%400==0)) {
            System.out.println("The year " + year + " is a leap year!");
            return year;
        }
        else {
            System.out.println(year + " is not a leap year.");
            return year;
        }
    }
    public static int getDaysinMonth (int month, int year) {

        if (year > 0 && year < 9999){
            switch (month) {

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println(month + "/" + year + " has 31 days");
                    return 31;
                case 4: case 6: case 9: case 11:
                    System.out.println(month + "/" + year + " has 30 days");
                    return 30;
                case 2:
                    if (year%4==0 && (year%100!=0 || year%400==0)) {
                        System.out.println(month + "/" + year + " has 29 days");
                        return 29;
                    }
                    else {
                        System.out.println(month + "/" + year + " has 28 days");
                        return 28;
                    }
                default:
                    System.out.println("Invalid month input!");
                    return -1;

            }

        }
        else {
            System.out.println("Invalid year input!");
            return -1;
        }

    }
}
