import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input18.nextInt();

        Pangkat [] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            png[i].nilai = input18.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            png[i].pangkat = input18.nextInt();
        }

        
        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");

        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");

        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        System.out.println("============================================================");
    }
}
