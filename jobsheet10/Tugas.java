import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai [][]= new double [10][6],total=0;
        for (int i=0;i<nilai.length;i++){
            System.out.println("Responden "+(i+1)+":");
            double totalNilai = 0;
            double rata2 = 0;
            for(int j=0;j<nilai[i].length;j++){
                System.out.print("Nilai Pertanyaan "+(j+1)+"(1-5) :");
                nilai[i][j]=sc.nextInt();
                totalNilai +=nilai[i][j];
                rata2=totalNilai/nilai[i].length;
                total+=nilai[i][j];
            }
            System.out.println("rata rata responden "+(i+1)+" : "+(rata2));
        }
         System.out.println("rata-rata Tiap Pertanyaan:");

        for (int j = 0; j < nilai[j].length; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerPertanyaan += nilai[i][j];
            }

            double rataPertanyaan = (double) totalPerPertanyaan / nilai.length;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rataPertanyaan);
        }
        double rataKeseluruhan=total/(nilai.length*nilai[0].length);
        System.out.println("nilai rata-rata secara keseluruhan adalah "+rataKeseluruhan);
        }
}
