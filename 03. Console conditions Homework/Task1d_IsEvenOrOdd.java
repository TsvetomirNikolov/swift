package com.company;

import java.util.Scanner;


public class Task1d_IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDigit = Integer.parseInt(scanner.nextLine());
        if (inputDigit %2 == 0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}

