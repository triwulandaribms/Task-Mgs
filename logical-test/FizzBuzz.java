package com.task.testMgs;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.println("masukan angka :");
        angka = scanner.nextInt();
        
        for (int a = 1; a <= angka; a++) {
            
          
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + " " + "FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println(a + " " + "Fizz");
            } else if (a % 5 == 0) {
                System.out.println(a + " " + "Buzz");

            }else{
                System.out.println(a);
            }
        }

        scanner.close();
    }
}



