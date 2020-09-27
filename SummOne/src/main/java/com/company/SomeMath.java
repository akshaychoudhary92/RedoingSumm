package com.company;

public class SomeMath {


    public Integer sumOfFive(int a, int b, int c, int d, int e){
      int sum =  a + b + c + d + e;
        System.out.println(sum);
                return sum;
    }

    public Integer averageFive(int a, int b, int c, int d, int e){
        int sum = a + b + c + d + e;

        int average = sum/5;
        System.out.println(average);
        return average;
    }

    public Double largestFive(double a, double b, double c, double d, double e){

        double largest;
        if(a > b && a > c && a > d && a > e){
            largest = a;
            System.out.println(largest);
        }else if(b > c && b > d && b > e){
            largest =b;
            System.out.println(largest);
        }else if(c > d && c > e){
            largest = c;
            System.out.println(largest);
        }else if(d > e){
            largest =d;
            System.out.println(largest);
        }else{
            largest =e;
            System.out.println(largest);
        }
        return largest;
    }
}
