import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan n =(0-99)");
        int n = sc.nextInt();
        if (n < 100) {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (n < 10) {
                        if (i == 1 || i == n || j == 1 || j == n) {
                            System.out.print(n + " ");
                        } else {
                            System.out.print("  ");
                        }
                    } else if (n >= 10 && n < 100) {
                        if (i == 1 || i == n || j == 1 || j == n) {
                            System.out.print(n + " ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Angka Salah");
        }
    }
}
