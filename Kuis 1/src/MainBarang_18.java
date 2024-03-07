import java.util.Scanner;

public class MainBarang_18 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String nama = "";
        int kode_barang = 0;
        int harga = 0;
        int stok = 0;

        Barang_18[] arrayOfBarang = new Barang_18[5];

        for (int i = 0; i < arrayOfBarang.length; i++) {
            arrayOfBarang[i] = new Barang_18(nama, kode_barang, harga, stok);
        }

        TransaksiBarang_18 transaksi = new TransaksiBarang_18();

        // Data Barang

        arrayOfBarang[0].nama = "Sabun";
        arrayOfBarang[0].kode_barang = 01;
        arrayOfBarang[0].harga = 10000;
        arrayOfBarang[0].stok = 75;

        arrayOfBarang[1].nama = "Shampo";
        arrayOfBarang[1].kode_barang = 02;
        arrayOfBarang[1].harga = 13000;
        arrayOfBarang[1].stok = 55;

        arrayOfBarang[2].nama = "Odol";
        arrayOfBarang[2].kode_barang = 03;
        arrayOfBarang[2].harga = 15000;
        arrayOfBarang[2].stok = 80;

        arrayOfBarang[3].nama = "Parfum";
        arrayOfBarang[3].kode_barang = 04;
        arrayOfBarang[3].harga = 20000;
        arrayOfBarang[3].stok = 25;

        arrayOfBarang[4].nama = "Lipstik";
        arrayOfBarang[4].kode_barang = 05;
        arrayOfBarang[4].harga = 35000;
        arrayOfBarang[4].stok = 50;

        int pilihan;

        header();
        System.out.println("\n        TOKO MAJU JAYA");
        header();

        do {

            System.out.println("\n1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");
            header();
            System.out.print("\nMasukkan Pilihan    : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n| Kode       | Nama       | Harga      | Stok       |");
                    for (int i = 0; i < arrayOfBarang.length; i++) {
                        arrayOfBarang[i].TampilkanBarang();
                    }
                    break;

                case 2:
                    System.out.println("\n| Kode       | Nama       | Harga      | Stok       |");
                    for (int i = 0; i < arrayOfBarang.length; i++) {
                        arrayOfBarang[i].TampilkanBarang();
                    }
                    beliBarang(arrayOfBarang, transaksi, input18);
                    break;

                case 3:
                    transaksi.tampilkanBarangPembelian();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 4);
    }

    public static void header() {
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
    }

    public static void beliBarang(Barang_18[] arrayOfBarang, TransaksiBarang_18 transaksi, Scanner input) {
        char lagi;
        do {
            System.out.print("Masukkan kode barang yang ingin dibeli : ");
            int kode = input.nextInt();

            Barang_18 barang = null;

            for (int i = 0; i < arrayOfBarang.length; i++) {
                if (arrayOfBarang[i].kode_barang == kode) {
                    barang = arrayOfBarang[i];
                    break;
                }
            }

            if (barang != null && barang.stok > 0) {
                transaksi.tambahBarang(barang);
                barang.stok--;
                System.out.print("Apakah Anda ingin membeli barang lagi? (y/n) : ");
                lagi = input.next().charAt(0);
            } else {
                System.out.println("Barang tidak ditemukan atau stok habis.");
                lagi = 'n';
            }
        } while (lagi == 'y');
    }
}
