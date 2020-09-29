package com.company;

public class CalculatorObject {
        public Integer Addition(int a, int b){
            int add = a + b;
            System.out.println(add);
            return add;
        }

    public Integer Subtraction(int a, int b){
        int sub = a - b;
        System.out.println(sub);
        return sub;
    }
    public Integer Multiply(int a, int b){
        int mul = a * b;
        System.out.println(mul);
        return mul;
    }
    public Integer Division(int a, int b){
        int div = a / b;
        System.out.println(div);
        return div;
    }

    public Double Addition(double a, double b){
            double add = a + b;
            return add;
    }

    public Double Subtraction(double a, double b){
        double sub = a - b;
        return sub;
    }

    public Double Division(double a, double b){
        double div = a / b;
        return div;
    }

    public Double Multiplication(double a, double b){
        double mul = a * b;
        return mul;
    }



}
