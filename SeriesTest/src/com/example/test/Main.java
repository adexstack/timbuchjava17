package com.example.test;

import static com.timbuchalka.mylibrary.Series.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("nNum " + "*".repeat(10));
        for(int i=0; i<= 10; i++){
            System.out.println(nSum(i));
        }
        System.out.println("factorial " + "*".repeat(10));
        for(int i=0; i<= 10; i++){
            System.out.println(factorial(i));
        }
        System.out.println("fibonacci " + "*".repeat(10));
        for(int i=0; i<= 10; i++){
            System.out.println(fibonacci(i));
        }
    }
}
