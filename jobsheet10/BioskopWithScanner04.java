import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;
        while (true) {

            System.out.print("- Menu 1: Input data penonton\n" + "- Menu 2: Tampilkan daftar penonton\n"
                    + "- Menu 3: Exit\n" + "Pilih Menu (1/2/3) = ");
            int menu = sc.nextInt();
            if (menu == 1) {
                while (true) {

                    System.out.print("Masukkan nama: ");
                    nama = sc.next();

                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    } else {
                        System.out.println("Kursi tidak tersedia");
                    }
                }

            }
            if (menu == 2) {
                System.out.println("Seat List");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Kursi baris ke " + (i + 1) + " : ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j] + ", ");
                        } else {
                            System.out.print("***, ");
                        }
                    }
                    System.out.println();
                }
            }
            if (menu == 3) {
                break;
            }
            System.out.println();
        }
    }
}
