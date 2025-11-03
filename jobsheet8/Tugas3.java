import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();
        int totalTerjual=0,totalPelanggan=0;
        for (int i=1;i<=cabang;i++){
            int jmlItem=0;
            System.out.println("--- Cabang "+i+" ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            for (int j=1;j<=pelanggan;j++){
                System.out.print(" - Pelanggan "+j+" memesan berapa item? ");
                int item = sc.nextInt();
                jmlItem +=item;
                totalTerjual += item;
                totalPelanggan+=pelanggan;
            }
            System.out.println("- Pelanggan\t: "+pelanggan+" orang");
            System.out.println("- Item terjual\t: "+jmlItem +" item");
            System.out.println();
        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan\t: " +totalPelanggan+ " orang");
        System.out.println("Item terjual\t: "+totalTerjual+" item");
    }
}
