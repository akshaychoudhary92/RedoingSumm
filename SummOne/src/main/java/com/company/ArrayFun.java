package com.company;

public class ArrayFun {
    public void arrayFunReverse(){
        int[] firstArray = {1, 2, 3, 4, 5};

        int length = firstArray.length;

        int[] secondArray = new int[length];

        for(int i = 0; i < length; i++){
            secondArray[i] = firstArray[length - i - 1];

        }

        System.out.println("Original Array");

        for(int i = 0; i < firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        for(int i = 0; i < secondArray.length; i++){
            System.out.println(secondArray[i]);
        }




    }
}
