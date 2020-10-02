package com.sparta.saleh;

public class FactorialRecursion {

    public static int factorialRecursion(int number){
        if(number >= 1){
            return number * factorialRecursion(number -1);
        }
        else{
            return 1;
        }
    }
}
