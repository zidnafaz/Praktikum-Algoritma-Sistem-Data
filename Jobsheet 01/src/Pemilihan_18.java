package src;

import java.util.Scanner;

public class Pemilihan_18 {

    public static void main(String[] args) {

        double nilaiTugas = 0, nilaiKuis = 0, nilaiUTS = 0, nilaiUAS = 0;
        String nilaiHuruf = "", kualifikasi = "";

        System.out.println("          Program Menghitung Nilai AKhir");
        System.out.println("==================================================");

        nilaiTugas = inputNilaiTugas(nilaiTugas);
        nilaiKuis = inputNilaiKuis(nilaiKuis);
        nilaiUTS = inputNilaiUTS(nilaiUTS);
        nilaiUAS = inputNilaiUAS(nilaiUAS);

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Selamat Anda LULUS dengan Kualifikasi Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Selamat Anda LULUS dengan Kualifikasi Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Selamat Anda LULUS dengan Kualifikasi Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Selamat Anda LULUS dengan Kualifikasi Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Selamat Anda LULUS dengan Kualifikasi Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Maaf Anda TIDAK LULUS dengan Kualifikasi Kurang";
        } else if (nilaiAkhir < 39) {
            nilaiHuruf = "E";
            kualifikasi = "Maaf Anda TIDAK LULUS dengan Kualifikasi Gagal";
        }

        System.out.println("==================================================");

        System.out.println("Nilai Akhir Anda    : " + nilaiAkhir);
        System.out.println("Nilai Huruf Anda    : " + nilaiHuruf);

        System.out.println("==================================================");

        System.out.println(kualifikasi);
        System.out.println("");

    }

    public static double inputNilaiTugas(double nilaiTugas) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas    : ");
        nilaiTugas = input18.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai Tidak Valid, Silahkan Masukkan Nilai Kembali");
            return inputNilaiTugas(nilaiTugas);
        }

        return nilaiTugas;
    }

    public static double inputNilaiKuis(double nilaiKuis) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai Kuis     : ");
        nilaiKuis = input18.nextDouble();

        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai Tidak Valid, Silahkan Masukkan Nilai Kembali");
            return inputNilaiKuis(nilaiKuis);
        }

        return nilaiKuis;
    }

    public static double inputNilaiUTS(double nilaiUTS) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai UTS      : ");
        nilaiUTS = input18.nextDouble();

        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai Tidak Valid, Silahkan Masukkan Nilai Kembali");
            return inputNilaiUTS(nilaiUTS);
        }

        return nilaiUTS;
    }

    public static double inputNilaiUAS(double nilaiUAS) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai UAS      : ");
        nilaiUAS = input18.nextDouble();

        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid, Silahkan Masukkan Nilai Kembali");
            return inputNilaiUAS(nilaiUAS);
        }

        return nilaiUAS;
    }
}