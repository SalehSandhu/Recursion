package com.sparta.saleh;

public class FibonacciRecursion {

    public static int fibonnaciRecursion(int number){
        if(number == 0)
            return 0;
        else if(number == 1)
            return 1;
        else
            return fibonnaciRecursion(number - 1) + fibonnaciRecursion(number - 2);

    }
    }


