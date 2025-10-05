package jobsheet5;

import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah anda membawa kartu mahasiswa (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah sudah melakukan registrasi online (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();
        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Anda Boleh Masuk");
        } else {
            System.out.println("Anda Tidak Boleh Masuk");
        }
    }
}
