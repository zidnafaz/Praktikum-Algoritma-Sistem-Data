package ProgramNonCollection;

import java.util.Scanner;

public class LaundryMain_18 {
    
    public static LinkedListPelanggan_18 listPelanggan = new LinkedListPelanggan_18();
    public static LinkedListTransaksi_18 listTransaksi = new LinkedListTransaksi_18();
    public static Scanner input18 = new Scanner(System.in);

    public static void main(String[] args) {
        listPelanggan.addLast(new Pelanggan_18(1, "Ahmad", "081234567890"));
        listPelanggan.addLast(new Pelanggan_18(2, "Budi", "081234567891"));
        listPelanggan.addLast(new Pelanggan_18(3, "Sandi", "081234567892"));
        listPelanggan.addLast(new Pelanggan_18(4, "Dewi", "081234567893"));
        listPelanggan.addLast(new Pelanggan_18(5, "Eka", "081234567894"));

        int pilihan;

        do {
            header();
            System.out.println("               LAUNDRY JAYA MANDIRI");
            header();
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Hapus Pelanggan");
            System.out.println("3. Lihat Pelanggan");
            System.out.println("4. Tambah Transaksi");
            System.out.println("5. Hapus Transaksi");
            System.out.println("6. Lihat Transaksi");
            System.out.println("7. Urutkan Pelanggan Berdasarkan Nama (A-Z)");
            System.out.println("8. Cari Transaksi Berdasarkan Nama Pelanggan");
            System.out.println("9. Keluar");
            header();
            System.out.print("Masukkan pilihan      : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    tambahPelanggan();
                    break;
                case 2:
                    hapusPelanggan();
                    break;
                case 3:
                    lihatPelanggan();
                    break;
                case 4:
                    tambahTransaksi();
                    break;
                case 5:
                    hapusTransaksi();
                    break;
                case 6:
                    lihatTransaksi();
                    break;
                case 7:
                    urutkanPelanggan();
                    break;
                case 8:
                    cariTransaksi();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 9);
    }

    public static void header() {
        System.out.println("==================================================");
    }

    public static void tambahPelanggan() {
        header();
        System.out.println("                 Tambah Pelanggan");
        header();
        System.out.print("Masukkan ID Pelanggan         : ");
        int id = input18.nextInt();
        input18.nextLine();
        System.out.print("Masukkan Nama Pelanggan       : ");
        String nama = input18.nextLine();
        System.out.print("Masukkan No Telp Pelanggan    : ");
        String noTelp = input18.nextLine();
        listPelanggan.addLast(new Pelanggan_18(id, nama, noTelp));
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    public static void hapusPelanggan() {
        header();
        System.out.println("                  Hapus Pelanggan");
        header();
        lihatPelanggan();
        System.out.print("Masukkan ID Pelanggan yang akan dihapus   : ");
        int id = input18.nextInt();
        listPelanggan.remove(id);
        System.out.println("Pelanggan berhasil dihapus!");
    }

    public static void lihatPelanggan() {
        System.out.println("-------------------------------------------------");
        System.out.println("| ID\t| Nama\t\t| No Telp\t\t|");
        System.out.println("-------------------------------------------------");
        listPelanggan.print();
        System.out.println("-------------------------------------------------");
    }

    public static void tambahTransaksi() {
        header();
        System.out.println("                 Tambah Transaksi");
        header();
        lihatPelanggan();
        System.out.print("Masukkan ID Pelanggan             : ");
        int idPelanggan = input18.nextInt();
        Pelanggan_18 pelanggan = listPelanggan.findById(idPelanggan);
        if (pelanggan == null) {
            System.out.println("Pelanggan tidak ditemukan!");
            return;
        }

        String jenisLayanan = pilihLayanan();
        System.out.print("Masukkan berat atau jumlah pcs    : ");
        double jumlah = input18.nextDouble();
        double harga = hitungHarga(jenisLayanan, jumlah);

        listTransaksi.addLast(new Transaksi_18(pelanggan, jenisLayanan, jumlah, harga));
        System.out.println("Transaksi berhasil ditambahkan!");
    }

    public static void hapusTransaksi() {
        header();
        System.out.println("                  Hapus Transaksi");
        header();
        lihatTransaksi();
        System.out.print("Masukkan ID Transaksi yang akan dihapus   : ");
        int id = input18.nextInt();
        listTransaksi.remove(id);
        System.out.println("Transaksi berhasil dihapus!");
    }

    public static void lihatTransaksi() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("| ID\t| Nama Pelanggan\t| Jenis Layanan\t\t| Berat/pcs\t| Harga\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        listTransaksi.print();
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static String pilihLayanan() {
        header();
        System.out.println("                 Jenis Layanan");
        header();
        System.out.println("1. Cuci Kering Regular (6000/kg)");
        System.out.println("2. Cuci Kering Ekspres (9000/kg)");
        System.out.println("3. Cuci Setrika Regular (8000/kg)");
        System.out.println("4. Cuci Setrika Ekspres (12000/kg)");
        System.out.println("5. Cuci Sepatu (35000/pcs)");
        System.out.println("6. Cuci Boneka (10000/pcs)");
        header();
        System.out.print("Pilih jenis layanan               : ");
        int pilihanLayanan = input18.nextInt();

        switch (pilihanLayanan) {
            case 1:
                return "Cuci Kering Regular";
            case 2:
                return "Cuci Kering Ekspres";
            case 3:
                return "Cuci Setrika Regular";
            case 4:
                return "Cuci Setrika Ekspres";
            case 5:
                return "Cuci Sepatu         ";
            case 6:
                return "Cuci Boneka         ";
            default:
                System.out.println("Pilihan tidak valid!");
                return pilihLayanan();
        }
    }

    public static double hitungHarga(String jenisLayanan, double jumlah) {
        switch (jenisLayanan) {
            case "Cuci Kering Regular":
                return jumlah * 6000;
            case "Cuci Kering Ekspres":
                return jumlah * 9000;
            case "Cuci Setrika Regular":
                return jumlah * 8000;
            case "Cuci Setrika Ekspres":
                return jumlah * 12000;
            case "Cuci Sepatu         ":
                return jumlah * 35000;
            case "Cuci Boneka         ":
                return jumlah * 10000;
            default:
                return 0;
        }
    }

    public static void urutkanPelanggan() {
        header();
        System.out.println("     Urutkan Pelanggan Berdasarkan Nama (A-Z)");
        header();
        listPelanggan.sortByName();
        lihatPelanggan();
    }

    public static void cariTransaksi() {
        header();
        System.out.println("     Cari Transaksi Berdasarkan Nama Pelanggan");
        header();
        System.out.print("Masukkan Nama Pelanggan   : ");
        input18.nextLine();
        String namaPelanggan = input18.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("| ID\t| Nama Pelanggan\t| Jenis Layanan\t\t| Berat/pcs\t| Harga\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------");
        NodeTransaksi_18 currentNode = listTransaksi.head;
        while (currentNode != null) {
            if (currentNode.transaksi.pelanggan.namaPelanggan.equalsIgnoreCase(namaPelanggan)) {
                System.out.println("| " + currentNode.transaksi.pelanggan.idPelanggan + "\t| " + currentNode.transaksi.pelanggan.namaPelanggan + "\t| "
                        + currentNode.transaksi.jenisLayanan + "\t| " + currentNode.transaksi.jumlah + "\t| " + currentNode.transaksi.harga + "\t|");
            }
            currentNode = currentNode.next;
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
