package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public void MonthIfMethod() {
        Scanner scan = new Scanner(System.in);



        System.out.println("Please input a number between 1 and 12");
        int number = Integer.parseInt(scan.nextLine());

        String month;

        if (number == 1) {
            month = "january";
            System.out.println(month);
        } else if (number == 2) {
            month = "Febuaray";
            System.out.println(month);
        } else if (number == 3) {
            month = "March";
            System.out.println(month);
        } else if (number == 4) {
            month = "April";
            System.out.println(month);
        } else if (number == 5) {
            month = "May";
            System.out.println(month);
        } else if (number == 6) {
            month = "June";
            System.out.println(month);
        } else if (number == 7) {
            month = "July";
            System.out.println(month);
        } else if (number == 8) {
            month = "August";
            System.out.println(month);
        } else if (number == 9) {
            month = "September";
            System.out.println(month);
        } else if (number == 10) {
            month = "October";
            System.out.println(month);
        } else if (number == 11) {
            month = "November";
            System.out.println(month);
        } else if (number == 12) {
            month = "December";
            System.out.println(month);
        } else {
            System.out.println("You have entered a invalid number.");
        }
    }















}
