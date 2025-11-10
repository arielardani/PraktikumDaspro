package jobsheet9;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan banyaknya nilai yang akan di input: ");
        int k = sc.nextInt();
        int[] arrNilai = new int[k];
        int hasil = 0, key;
        boolean statusSearch= false;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukan nilai yang ingin di cari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = (i + 1);
                statusSearch = true;
                break;
            }
        }
        if (statusSearch){
            System.out.println("Nilai " + key + " Merupakan nilai mahasiswa ke " + hasil);
        }else{
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
