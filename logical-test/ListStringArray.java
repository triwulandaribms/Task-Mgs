package com.task.testMgs;

import java.util.Scanner;

public class ListStringArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Masukkan data berupa array:");
        input = scanner.nextLine().replace("[", "").replace("]", "");

        String[] dataArray = input.split(",");
        int jumlah = 0;

        for (String data : dataArray) {
            boolean isAngka = true;

            for (char c : data.toCharArray()) {
                if (!Character.isDigit(c)) { 
                    isAngka = false;
                    break;
                }
            }

            if (isAngka) {
                jumlah++;
            }
        }

        System.out.println("Jumlah angka dalam array: " + jumlah);
        
        scanner.close();
    }
}
