package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int mhs = sc.nextInt();
        int[] nilaiMhs = new int[mhs];
        double total = 0,totalLulus = 0,totalTidakLulus = 0, rataLulus,rataTidakLulus;
        int lulus = 0,tidakLulus=0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70){
                lulus++;
                totalLulus += nilaiMhs[i];

            }else {
                tidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        rataLulus = totalLulus / lulus;
        rataTidakLulus = totalTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah Mahasiswa yang lulus : " +lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : " +tidakLulus);
        System.out.println("Rata-rata nilai lulus = " +rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " +rataTidakLulus);
    }
}
