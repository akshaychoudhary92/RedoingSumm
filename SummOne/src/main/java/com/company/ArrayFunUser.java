package com.company;

import java.util.Scanner;

public class ArrayFunUser {
    public void readArray(){
        Scanner scan = new Scanner(System.in);

        int intArray[] = new int[5];

        for (int i = 0; i < intArray.length; i++){
            System.out.println("please enter a number");
            intArray[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.print( intArray[i] + ",");
        }


    }
}
