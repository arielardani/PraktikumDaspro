package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe04 {
    public static void main(String[] args) {

        int[][] dataPenjualan = new int[5][7];

        String[] namaMenu = { "Kopi\t", "Teh\t", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
        inputData(dataPenjualan, namaMenu);
        tampilkanData(dataPenjualan, namaMenu);
        menuTertinggi(dataPenjualan, namaMenu);
        rataRata(dataPenjualan, namaMenu);
    }

    public static void inputData(int[][] penjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("menu: " + menu[i]);
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
     public static void tampilkanData(int[][] dataPenjualan, String[] menu) {
       System.out.println("Data penjualan dari hari pertama hari terakhir");
       System.out.print("menu\t\t\t");
       for (int i=0;i<dataPenjualan[0].length;i++){
        System.out.print("Hari ke "+ (i+1)+"\t");
       }
       System.out.println();
       for (int i=0;i<dataPenjualan.length;i++){
        System.out.print(menu[i]+"\t\t");
        for (int j=0;j<dataPenjualan[i].length;j++){
            System.out.print(dataPenjualan[i][j]+"\t\t");
        }
        System.out.println();
       }
        
    }
    public static void menuTertinggi(int[][] dataPenjualan, String[] menu) {
        int rekor = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            
            if (totalPenjualan > rekor) {
                rekor = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTerlaris);
        System.out.println("total terjual sebanyak :"+ rekor);
    }
    public static void rataRata(int[][] dataPenjualan, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            double totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rata = (double) totalPenjualan / dataPenjualan[0].length;
            System.out.println(menu[i]+" : "+rata);
        }
    }
}
