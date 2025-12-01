package jobsheet11;

import java.util.Scanner;

public class Kubus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa panjang sisi kubus anda ");
        double sisi = sc.nextDouble();
        double luasPermukaan = hitungLuasPermukaan(sisi);
        double volume = hitungVolumeKubus(sisi);
        System.out.println("volumenya adalah " + volume);
        System.out.println("Luas Permukaannya adalah " + luasPermukaan);
    }
    public static double hitungVolumeKubus(double sisi){
        double volume = sisi * sisi * sisi;
        return volume;
    }
    public static double hitungLuasPermukaan(double sisi){
        double luasPermukaan = sisi * sisi * 6;
        return luasPermukaan;
    }
}
