package jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalHarga = 0, harga = 50000, totalPenjualan = 0,totalTiket=0;
        for (int i = 1; i > 0; i++) {
            System.out.print("Beli Tiket?(ya/tidak)");
            String beli = sc.next();
            if (beli.equalsIgnoreCase("ya")) {
                System.out.print("Berapa tiket yang anda beli ");
                int tiket = sc.nextInt();
                if (tiket > 0) {
                    if (tiket > 4 && tiket < 11) {
                        System.out.println("anda mendapat diskon 10% HOREEEEE");
                        totalHarga = 0.9 * tiket * harga;
                    } else if (tiket > 10) {
                        System.out.println("anda mendapat diskon 15% HOREEEEE");
                        totalHarga = 0.85 * tiket * harga;
                    }
                } else {
                    System.out.println("Input tidak valid");
                }
                System.out.println("total harga yang harus anda bayar adalah " + totalHarga);
                totalTiket +=tiket;
                totalPenjualan += totalHarga;
            } else if (beli.equalsIgnoreCase("tidak")) {
                System.out.println("Program Selesai");
                break;
            }
        }
        System.out.println("Tiket anda laku sebanyak " +totalTiket);
        System.out.println("Total penjualan anda hari ini adalah " + totalPenjualan);
    }
}
