package com.company;

import java.util.Scanner;

public class ValidNumber {
    public void ValidNumberLoop(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");
        int UserInput = scan.nextInt();

//        "You must enter a number between 1 and 10, please try again."
        while(true) {
            if (UserInput > 10 || UserInput < 1) {
                System.out.println("You must enter a number between 1 and 10, please try again.");
                UserInput = scan.nextInt();


            }else{break;}
        }

        System.out.println(UserInput);


    }
}
