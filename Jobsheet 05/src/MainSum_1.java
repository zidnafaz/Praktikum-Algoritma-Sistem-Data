import java.util.Scanner;

public class MainSum_1 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPerusahaan = input18.nextInt();
        
        int[] jumlahBulan = new int[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
            jumlahBulan[i] = input18.nextInt();
        }

        Sum_1[] sums = new Sum_1[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("============================================================");
            System.out.println("Keuntungan perusahaan ke-" + (i + 1));
            sums[i] = new Sum_1(jumlahBulan);
            for (int j = 0; j < jumlahBulan[i]; j++) {
                System.out.print("Masukkan keuntungan perusahaan ke-" + (i + 1) + " pada bulan ke-" + (j + 1) + ": ");
                sums[i].keuntungan[i][j] = input18.nextDouble();
            }
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + " adalah " + sums[i].totalBF(sums[i].keuntungan[i]));
        }

        System.out.println("============================================================");        
        System.out.println("Algoritma Divide Conquer");

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) +  " adalah " + sums[i].totalDC(sums[i].keuntungan[i], 0, jumlahBulan[i] - 1));
        }
        System.out.println("============================================================");
    }
}
