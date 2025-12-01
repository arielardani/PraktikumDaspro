package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();
        double nilaiMahasiswa[] = new double[jmlMahasiswa];
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        double total = hitTot(nilaiMahasiswa);
        System.out.println("total nilai seluruh mahasiswa adalah " + total);
    }

    public static void isianArray(double[] nilaiMahasiswa) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

    }

    public static void tampilArray(double[] nilaiMahasiswa) {
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
    }

    public static double hitTot(double[] nilaiMahasiswa) {
        double total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }

        return total;
    }

}