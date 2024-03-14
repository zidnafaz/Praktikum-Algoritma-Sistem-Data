import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("============================================================");
            System.out.println("                            MENU");
            System.out.println("1. Hitung Pangkat dengan Brute Force");
            System.out.println("2. Hitung Pangkat dengan Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.println("============================================================");
            System.out.print("Pilih menu : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    PangkatBF();
                    break;
                case 2:
                    PangkatDC();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        } while (pilihan != 3);
    }

    public static void PangkatBF() {
        Scanner input18 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input18.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = input18.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = input18.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");

        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].getNilai() + " pangkat " + png[i].getPangkat() + " adalah : "
                    + png[i].pangkatBF(png[i].getNilai(), png[i].getPangkat()));
        }
    }

    public static void PangkatDC() {
        Scanner input18 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = input18.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = input18.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = input18.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");

        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].getNilai() + " pangkat " + png[i].getPangkat() + " adalah : "
                    + png[i].pangkatDC(png[i].getNilai(), png[i].getPangkat()));
        }
    }
}
