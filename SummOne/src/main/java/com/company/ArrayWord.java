package com.company;

import java.util.Scanner;

public class ArrayWord {
    public void arrayFunWord(){
        String[] wordArray = new String[5];

        for (int i = 0; i < wordArray.length; i++){
                Scanner scan = new Scanner(System.in);

            System.out.println("please enter a word ");
                wordArray[i] = scan.nextLine();
        }

        for(int i = 0; i < wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
    }
}
