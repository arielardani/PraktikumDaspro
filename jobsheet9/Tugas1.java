package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalNilai = 0, rata2;
        String terendahS="",tertinggiS="";
        System.out.print("Jumlah mahasiswa : ");
        int jMhs = sc.nextInt();
        int mahasiswa[] = new int[jMhs], tertinggi = 0, terendah = 100;
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Masukan nilai mahasiswa " + (i + 1) + " : ");
            mahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa " + (i + 1) + " : " + mahasiswa[i]);
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            totalNilai += mahasiswa[i];
        }
        for (int i = 0; i < mahasiswa.length; i++) {
            if (terendah>mahasiswa[i]){
                terendah = mahasiswa[i];
                 terendahS = "Nilai mahasiswa terendah adalah mahasiswa ke "+ (i+1);
            }
            if (tertinggi<mahasiswa[i]){
                tertinggi =mahasiswa[i];
                tertinggiS = "Nilai mahasiswa tertinggi adalah mahasiswa ke "+ (i+1);
            }
        }
        System.out.println( tertinggiS+ " Dengan perolehan nilai\t: " + tertinggi);
        System.out.println(terendahS + " Dengan perolehan nilai\t: " + terendah);
        rata2 = totalNilai / mahasiswa.length;
        System.out.println("Rata-rata nilai mahasiswa adalah " + rata2);
    }
}
