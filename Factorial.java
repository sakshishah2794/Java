package com.java;
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial:");
        int x = sc.nextInt();
        int fsum=1;
        for (int i = 1; i <= x;){
            int factorial = i * x;
            fsum = fsum * factorial;
            x=x-1;
        }
        System.out.println("Factorial is: "+fsum);
    }
}
