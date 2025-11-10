package jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa item yang anda pesan? ");
        int jmlPesanan = sc.nextInt();
        String namaPesanan[] = new String[jmlPesanan];
        double hargaPesanan[] = new double[jmlPesanan],total=0;
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukan Nama pesanan : ");
            namaPesanan[i] = sc.next();
            System.out.print("Masukan Harga pesanan : ");
            hargaPesanan[i] = sc.nextDouble();
            System.out.println();
            total +=hargaPesanan[i];
        }
        System.out.println("Pesanan anda adalah");
        for (int i=0;i<jmlPesanan;i++){
            System.out.println(namaPesanan[i]+"dengan harga "+hargaPesanan[i]);
        }
        System.out.println("Total biaya yang harus anda bayar adalah "+total);
    }
}
