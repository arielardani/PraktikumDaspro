package jobsheet11;

import java.util.Scanner;

public class Kafe04 {
    public static double hitungTotalHarga(int pilihanMenu, double banyakItem,String kodePromo) {
        double[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        
        double hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapat potongan harga 50%");
            hargaTotal = hargaTotal * 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapat potongan harga 30%");
            hargaTotal = hargaTotal * 0.7 ;
        } else {
            System.out.println("Kode promo invalid.");
        }

        return hargaTotal;
    }

    public static void Menu() {
       // System.out.println("Selamat datang, " + namaPelanggan + "!");

        // if (isMember) {
        //     System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        // }
        // if (kodePromo.equalsIgnoreCase("DISKON50")) {
        //     System.out.println("Anda mendapat diskon 50%");
        // } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        //     System.out.println("Anda mendapat diskon 30%");
        // } else {
        //     System.out.println("Invalid");
        // }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        // Menu("Andi", true, "DISKON50");
        // Menu("Budi", true, "DISKON30");
        double totalKeseluruhan=0;

         while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk berhenti): ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            double banyakItem = sc.nextInt();
            System.out.print("kode promo  : ");
            String kodePromo = sc.next();
            
            double hargaItem = hitungTotalHarga(pilihanMenu, banyakItem,kodePromo );
            totalKeseluruhan += hargaItem;
        }
        System.out.println("total pesanan anda adalah " + totalKeseluruhan);

    }
}
