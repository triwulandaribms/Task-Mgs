package com.task.testMgs;

import java.util.Scanner;

public class KalimatAcak {

    public String ubahKalimat(String kalimat) {

        String[] kata = kalimat.split(" ");
        StringBuilder tampung = new StringBuilder();

        for (String word : kata) {
            String dataHuruf = new StringBuilder(word).reverse().toString();
            tampung.append(dataHuruf).append(" ");
        }

        return tampung.toString().trim();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KalimatAcak kalimatAcak = new KalimatAcak();

        System.out.print("Masukkan kalimat acak:");
        String kalimat = scanner.nextLine();

      
        String hasil = kalimatAcak.ubahKalimat(kalimat);
        System.out.println("Kalimat yang telah diurutkan:");
        System.out.println(hasil);

        scanner.close();
    }
}
