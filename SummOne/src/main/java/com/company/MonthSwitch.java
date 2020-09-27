package com.company;

import java.util.Scanner;

public class MonthSwitch {
    public void MonthSwitchCon(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a valid number");

        int userInput = Integer.parseInt(scan.nextLine());

        String month;

        switch(userInput){
            case 1:
                month = "January";
                System.out.println(month);
                break;
            case 2:
                month = "Febuary";
                System.out.println(month);
                break;
            case 3:
                month = "March";
                System.out.println(month);
                break;
            case 4:
                month = "APril";
                System.out.println(month);
                break;
            case 5:
                month = "May";
                System.out.println(month);
                break;
            case 6:
                month = "June";
                System.out.println(month);
                break;
            case 7:
                month = "July";
                System.out.println(month);
                break;
            case 8:
                month = "August";
                System.out.println(month);
                break;
            case 9:
                month = "September";
                System.out.println(month);
                break;
            case 10:
                month = "october";
                System.out.println(month);
                break;
            case 11:
                month = "november";
                System.out.println(month);
                break;
            case 12:
                month = "december";
                System.out.println(month);
                break;
            default:
                System.out.println("invalid");

        }

    }
}
