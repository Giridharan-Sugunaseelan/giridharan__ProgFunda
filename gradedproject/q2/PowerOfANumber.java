package com.gradedproject.q2;

import java.util.Scanner;

public class PowerOfANumber {
    public static int power(int base, int pow){
        if(pow == 0){
            return 1;
        }
        return base * power(base,pow-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number X: ");
        int base = input.nextInt();

        System.out.print(("Enter the power N: "));
        int power = input.nextInt();

        System.out.println("X power N is " + power(base,power));
    }
}
