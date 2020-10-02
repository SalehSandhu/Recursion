package com.sparta.saleh;

public class HeadAndTailRecursion {
    public static void head(int number) {
        if(number > 0){
            head(number-1);
            System.out.print(number + ", ");
        }

    }

    public static void tail(int number){

        if(number > 0){
            System.out.print(number + ", ");
            tail(number -1);

        }

    }
}
