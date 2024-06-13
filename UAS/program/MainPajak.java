package program;

import java.util.Scanner;

public class MainPajak {

    private static LinkedList_18 transaksiPajakList = new LinkedList_18();

    private static Kendaraan[] kendaraanList = {
            new Kendaraan("B 1234 CD", "Andi", "Mobil", 1500, 2020, 6),
            new Kendaraan("D 5678 EF", "Budi", "Mobil", 1800, 2019, 12),
            new Kendaraan("E 9101 GH", "Dini", "Motor", 250, 2021, 3),
            new Kendaraan("F 1122 IJ", "Nina", "Mobil", 2000, 2022, 9),
            new Kendaraan("G 3344 KL", "Arto", "Motor", 125, 2023, 4)
    };

    private static Scanner input_18 = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            header();
            System.out.println("                 MENU");
            header();
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Urutkan Transaksi Berdasarkan Huruf Nama A-M");
            System.out.println("6. Urutkan Transaksi Berdasarkan Huruf Nama N-Z");
            System.out.println("7. Keluar");
            header();
            System.out.print("Masukkan pilihan          : ");
            pilihan = input_18.nextInt();

            switch (pilihan) {
                case 1:
                    daftarKendaraan();
                    break;
                case 2:
                    bayarPajak();
                    break;
                case 3:
                    tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    urutkanTransaksiBerdasarkanNamaPemilik();
                    break;
                case 5:
                    urutkanTransaksiBerdasarkanHurufNamaAM();
                    break;
                case 6:
                    urutkanTransaksiBerdasarkanHurufNamaNZ();
                    break;
                case 7:
                    header();
                    System.out.println("               Terimakasih");
                    header();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }

    public static void header() {
        for (int i = 1; i <= 40; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void headerTipis() {
        for (int i = 1; i <= 115; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void daftarKendaraan() {
        headerTipis();
        System.out.println(" | TNKB\t\t | Nama\t\t | Jenis\t\t | CC\t\t | Tahun\t | Bulan Harus Bayar\t | ");
        headerTipis();
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan);
        }
    }

    private static void bayarPajak() {
        System.out.print("Masukkan TNKB Kendaraan   : ");
        String tnkb = input_18.next();
        Kendaraan kendaraan = null;
        for (Kendaraan k : kendaraanList) {
            if (k.noTNKB.equals(tnkb)) {
                kendaraan = k;
                break;
            }
        }
        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan!");
            return;
        }
        System.out.print("Masukkan Bulan Bayar      : ");
        int bulanBayar = input_18.nextInt();

        long nominalBayar = hitungNominalBayar(kendaraan);
        long denda = hitungDenda(kendaraan, bulanBayar);

        TransaksiPajak transaksi = new TransaksiPajak(nominalBayar, denda, bulanBayar, kendaraan);
        transaksiPajakList.addLast(transaksi);

        header();
        System.out.println("Pembayaran pajak berhasil!");
        header();

        System.out.println(" | Kode\t | TNKB\t\t | Nama\t\t | Nominal\t\t | Denda\t | ");
        System.out.println(" | " + transaksi.kode + "\t | " + kendaraan.noTNKB + "\t | " + kendaraan.nama +  "\t\t | " + nominalBayar + "\t\t | " + denda + "\t\t | ");
        
    }

    private static long hitungNominalBayar(Kendaraan kendaraan) {
        if (kendaraan.jenis.equals("Motor")) {
            if (kendaraan.cc < 100) {
                return 100000;
            } else if (kendaraan.cc <= 250) {
                return 250000;
            } else {
                return 500000;
            }
        } else if (kendaraan.jenis.equals("Mobil")) {
            if (kendaraan.cc < 1000) {
                return 750000;
            } else if (kendaraan.cc <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }

    private static long hitungDenda(Kendaraan kendaraan, int bulanBayar) {
        int bulanHarusBayar = kendaraan.bulanHarusBayar;
        int selisihBulan = bulanBayar - bulanHarusBayar;

        if (selisihBulan > 0) {
            if (selisihBulan <= 3) {
                return 50000;
            } else {
                return selisihBulan * 50000;
            }
        }
        return 0;
    }

    private static void tampilkanSeluruhTransaksi() {
        header();
        System.out.println("            Seluruh Transaksi");
        header();

        headerTipis();
        System.out.println(" | Kode\t | TNKB\t\t | Nama\t\t | Nominal\t\t | Denda\t | ");
        headerTipis();
        transaksiPajakList.print();

        System.out.println("Total Pendapatan        : " + transaksiPajakList.calculateTotal());
    }

    private static void urutkanTransaksiBerdasarkanNamaPemilik() {
        LinkedList_18 sortedList = new LinkedList_18();
        Node_18 currentNode = transaksiPajakList.head;

        while (currentNode != null) {
            sortedList.insertSorted(currentNode.data);
            currentNode = currentNode.next;
        }

        headerTipis();
        System.out.println(" | Kode\t | TNKB\t\t | Nama\t\t | Nominal\t\t | Denda\t | ");
        headerTipis();

        sortedList.print();
    }

    private static void urutkanTransaksiBerdasarkanHurufNamaAM() {
        LinkedList_18 groupAtoM = new LinkedList_18();
        LinkedList_18 groupNtoZ = new LinkedList_18();
        Node_18 currentNode = transaksiPajakList.head;

        while (currentNode != null) {
            char firstLetter = currentNode.data.kendaraan.nama.charAt(0);
            if (firstLetter >= 'A' && firstLetter <= 'M') {
                groupAtoM.addLast(currentNode.data);
            } else if (firstLetter >= 'N' && firstLetter <= 'Z') {
                groupNtoZ.addLast(currentNode.data);
            }
            currentNode = currentNode.next;
        }
        
        header();
        System.out.println("           Transaksi Nama A-M");
        header();

        headerTipis();
        System.out.println(" | Kode\t | TNKB\t\t | Nama\t\t | Nominal\t\t | Denda\t | ");
        headerTipis();        
        groupAtoM.print();
    }

    private static void urutkanTransaksiBerdasarkanHurufNamaNZ() {
        LinkedList_18 groupAtoM = new LinkedList_18();
        LinkedList_18 groupNtoZ = new LinkedList_18();
        Node_18 currentNode = transaksiPajakList.head;

        while (currentNode != null) {
            char firstLetter = currentNode.data.kendaraan.nama.charAt(0);
            if (firstLetter >= 'A' && firstLetter <= 'M') {
                groupAtoM.addLast(currentNode.data);
            } else if (firstLetter >= 'N' && firstLetter <= 'Z') {
                groupNtoZ.addLast(currentNode.data);
            }
            currentNode = currentNode.next;
        }

        header();
        System.out.println("           Transaksi Nama N-Z");
        header();

        headerTipis();
        System.out.println(" | Kode\t | TNKB\t\t | Nama\t\t | Nominal\t\t | Denda\t | ");
        headerTipis(); 
        groupNtoZ.print();
    }

}
