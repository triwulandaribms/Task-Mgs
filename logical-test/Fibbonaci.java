package com.task.testMgs;

import java.util.Scanner;

public class Fibbonaci {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.print("masukan jumlah angka:");
        angka = scanner.nextInt();
        
        int[] deret = new int[angka];

        for(int i = 0; i < angka; i++){
            if(i == 0){
                deret[i] = 0; 
            }else if(i == 1){
                deret[i] = 1;
            }else{
                deret[i] = deret[i - 1] + deret [i - 2];
            }
        }

        System.out.println("Hasil bilangan deret :");
        for(int i = 0; i < angka; i++){
            System.out.print(deret[i] + " ");
        }

        scanner.close();

    }
}
