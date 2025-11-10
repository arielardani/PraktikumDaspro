package jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice" };
        String tersedia = "";
        System.out.print("Cari apa? ");
        String cari = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                tersedia ="Menu "+ menu[i] + " Tersedia";
                break;
            } else {
                tersedia = "Menu "+ cari + " tidak tersedia";
                
            }
        }
        System.out.println(tersedia);
    }
}
