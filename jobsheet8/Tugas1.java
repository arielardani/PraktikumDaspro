import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan N =");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat=0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            
            for(int j = 1; j <= i; j++){
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                System.out.print(kuadrat + " + ");
                
            }
            System.out.print("= "+jumlahKuadrat);
            System.out.println();
    }
}
}