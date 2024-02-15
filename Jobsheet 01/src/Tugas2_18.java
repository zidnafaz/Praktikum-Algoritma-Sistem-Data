package src;

import java.util.Scanner;

public class Tugas2_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("===================================================");
        System.out.println("     Program Hitung Jarak, Kecepatan, dan Waktu");
        System.out.println("====================================================");
        System.out.println("                    Pilihan Menu");
        System.out.println("1. Hitung Jarak");
        System.out.println("2. Hitung Kecepatan");
        System.out.println("3. Hitung Waktu\n");
        System.out.println("====================================================");
        System.out.print("Masukkan Pilihan    : ");
        int pilihan = input18.nextInt();

        switch (pilihan) {
            case 1:
                hitungJarak();
                break;
            case 2:
                hitungKecepatan();
                break;
            case 3:
                hitungWaktu();
                break;

            default:
                break;
        }
    }

    public static void hitungJarak() {
        Scanner input18 = new Scanner(System.in);

        double s, v, t;

        System.out.print("Masukkan kecepatan (Km/Jam)     : ");
        v = input18.nextDouble();
        System.out.print("Masukkan Waktu (Jam)            : ");
        t = input18.nextDouble();

        s = v * t;
        System.out.println("Jarak dari perhitungan diatas adalah " + s + " Km");

    }

    public static void hitungKecepatan() {
        Scanner input18 = new Scanner(System.in);

        double s, v, t;

        System.out.print("Masukkan Jarak (Km)             : ");
        s = input18.nextDouble();
        System.out.print("Masukkan Waktu (Jam)            : ");
        t = input18.nextDouble();

        v = s / t;
        System.out.println("Kecepatan dari perhitungan diatas adalah " + v + " Km/Jam");

    }

    public static void hitungWaktu() {
        Scanner input18 = new Scanner(System.in);

        double s, v, t;

        System.out.print("Masukkan kecepatan (Km/Jam)     : ");
        v = input18.nextDouble();
        System.out.print("Masukkan Jarak (Km)             : ");
        s = input18.nextDouble();

        t = s / v;
        System.out.println("Waktu dari perhitungan diatas adalah " + t + " Jam");

    }
}
