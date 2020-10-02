package com.sparta.saleh;

import static com.sparta.saleh.FibonacciRecursion.fibonnaciRecursion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input=10;

        int fibonnaci = FibonacciRecursion.fibonnaciRecursion(input);
        System.out.println("Fibonacci Value "+ input + ": " + fibonnaci);

        int factorial = FactorialRecursion.factorialRecursion(input);
        System.out.println("Factorial of " + input + " is: " + factorial);

        System.out.println("Head Recursion: ");
        HeadAndTailRecursion.head(input);

        System.out.println(" ");

        System.out.println("Tail Recursion: ");
        HeadAndTailRecursion.tail(input);

    }
}
