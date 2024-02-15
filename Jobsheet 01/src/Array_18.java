package src;

import java.util.Scanner;

public class Array_18 {
    static String mataKuliah[] = new String[9];
    static String nilaiHuruf[] = new String[9];
    static int SKSMataKuliah[] = new int[9];
    static double nilaiMataKuliah[] = new double[9];
    static double bobotNilai[] = new double[9];

    public static void main(String[] args) {

        double IP, totalIP = 0, totalSKS = 0, nilaiIPSemseter;

        System.out.println("======================================================================================");
        System.out.println("                            Program Menghitung IP Semester");
        System.out.println("======================================================================================");

        mataKuliah[0] = "Bahasa Indonesia";
        mataKuliah[1] = "Bahasa Inggris";
        mataKuliah[2] = "Agama";
        mataKuliah[3] = "Komsep Teknologi Informasi";
        mataKuliah[4] = "Matematika Dasar";
        mataKuliah[5] = "Dasar Pemrograman";
        mataKuliah[6] = "Praktikum Dasar Pemrograman";
        mataKuliah[7] = "Pengantar Akuntansi, Manajemen, dan Bisnis";
        mataKuliah[8] = "Critical Thinking and Problem Solving";

        SKSMataKuliah[0] = 2;
        SKSMataKuliah[1] = 2;
        SKSMataKuliah[2] = 2;
        SKSMataKuliah[3] = 2;
        SKSMataKuliah[4] = 2;
        SKSMataKuliah[5] = 2;
        SKSMataKuliah[6] = 3;
        SKSMataKuliah[7] = 2;
        SKSMataKuliah[8] = 2;

        nilaiMataKuliah(nilaiHuruf, bobotNilai);

        System.out.println("======================================================================================");
        System.out.println("                                 Hasil Konversi Nilai");
        System.out.println("======================================================================================");

        System.out.printf("%-40s %-15s %-15s %-15s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("======================================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-43s %-17s %-14s %-1s \n", mataKuliah[i], nilaiMataKuliah[i], nilaiHuruf[i],
                    bobotNilai[i]);
        }

        System.out.println("======================================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            IP = bobotNilai[i] * SKSMataKuliah[i];
            totalIP += IP;
            totalSKS += SKSMataKuliah[i];
        }

        nilaiIPSemseter = totalIP / totalSKS;
        System.out.printf("IP anda pada semester ini adalah " + "%.2f", nilaiIPSemseter);
        System.out.println();
        System.out.println("======================================================================================\n");


    }

    static void nilaiMataKuliah(String nilaiHuruf[], double bobotNilai[]) {
        Scanner input18 = new Scanner(System.in);
        
        for (int i = 0; i < nilaiMataKuliah.length; i++) {
            System.out.print("Masukkan Nilai Angka Mata Kuliah " + mataKuliah[i] + " : ");
            nilaiMataKuliah[i] = input18.nextDouble();

            if (nilaiMataKuliah[i] <= 100 && nilaiMataKuliah[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiMataKuliah[i] <= 80 && nilaiMataKuliah[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiMataKuliah[i] <= 73 && nilaiMataKuliah[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiMataKuliah[i] <= 65 && nilaiMataKuliah[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiMataKuliah[i] <= 60 && nilaiMataKuliah[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiMataKuliah[i] <= 50 && nilaiMataKuliah[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiMataKuliah[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
            if (nilaiMataKuliah[i] > 100 && nilaiMataKuliah[i] < 0) {
                nilaiMataKuliah[i] = 0;
                nilaiHuruf[i] = "Tidak Valid!";
                bobotNilai[i] = 0;
                nilaiMataKuliah(nilaiHuruf, bobotNilai);
            }
        }
    }
}

