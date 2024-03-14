import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elemen = input18.nextInt();

        Sum sm = new Sum(elemen);
        System.out.println("============================================================");
        for (int i = 0; i < sm.elemen; i++) {

            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = input18.nextDouble();

        }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalBF(sm.keuntungan));

        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        System.out.println("============================================================");

    }
}
