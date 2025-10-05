package jobsheet5;

import java.util.Scanner;

public class WIFIKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Pengguna;
        int sks;

        System.out.print("Pengguna: (dosen/mahasiswa) ");
        Pengguna = input.nextLine();

        if (Pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (Pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
