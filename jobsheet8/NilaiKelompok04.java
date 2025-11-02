import java.util.Scanner;

public class NilaiKelompok04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai, a = 0;
        int i = 1;
        String b = "";
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            if (a < rataNilai) {
                a = rataNilai;
                b = "Nilai terbaik adalah nilai kelompok " + i + " dengan rata rata nilai " + a;
            }
            System.out.println("Kelompok " + i + " Nilai Rata-Rata " + rataNilai);
            i++;

        }
        System.out.println(b);

    }
}
