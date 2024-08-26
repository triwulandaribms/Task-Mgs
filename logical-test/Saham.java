package com.task.testMgs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Saham {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data berupa array :");
        String input = scanner.nextLine().replace("[", "").replace("]", "").trim();
        
        int[] harga = parseHarga(input);

        int bestProfit = getProfit(harga);
        System.out.println("Keuntungan terbaik: " + bestProfit);

        scanner.close();
    }

    public static int[] parseHarga(String input) {
        String[] stringHarga = input.split(",");
        List<Integer> hargaList = new ArrayList<>();

        for (String hargaStr : stringHarga) {
            try {
                int price = Integer.parseInt(hargaStr.trim());
                hargaList.add(price);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + hargaStr);
            }
        }

        int[] prices = new int[hargaList.size()];
        for (int i = 0; i < hargaList.size(); i++) {
            prices[i] = hargaList.get(i);
        }

        return prices;
    }

    public static int getProfit(int[] prices) {
        if (prices.length < 2) {
            throw new IllegalArgumentException("Harus ada setidaknya dua harga untuk menghitung keuntungan.");
        }

        int minHarga = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            int potentialProfit = price - minHarga;

            maxProfit = Math.max(maxProfit, potentialProfit);
            minHarga = Math.min(minHarga, price);
        }

        return maxProfit;
    }
}
