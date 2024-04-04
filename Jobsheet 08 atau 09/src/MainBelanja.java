import java.util.Scanner;

public class MainBelanja {
    public static void main(String[] args) {
        StackStruk stackStruk = new StackStruk();
        Scanner input18 = new Scanner(System.in);

        String pilihanString;
        int pilihanInt;

        stackStruk.push(new StrukBelanja(1001, "01-01-2024", 5, 250000));
        stackStruk.push(new StrukBelanja(1002, "08-01-2024", 3, 150000));
        stackStruk.push(new StrukBelanja(1003, "15-01-2024", 4, 200000));
        stackStruk.push(new StrukBelanja(1004, "22-01-2024", 2, 100000));
        stackStruk.push(new StrukBelanja(1005, "29-01-2024", 6, 300000));
        stackStruk.push(new StrukBelanja(1006, "05-02-2024", 3, 150000));
        stackStruk.push(new StrukBelanja(1007, "12-02-2024", 4, 200000));
        stackStruk.push(new StrukBelanja(1008, "19-02-2024", 5, 250000));

        System.out.println("============================================================");
        System.out.println("      Informasi Struk Belanja yang Masih Tersimpan:");
        System.out.println("============================================================");
        stackStruk.display();

        do {

            System.out.println("==============================");
            System.out.println("            MENU");
            System.out.println("==============================");
            System.out.println("1. Tambah Struk");
            System.out.println("2. Ambil Struk");
            System.out.println("3. Tampil Struk");
            System.out.println("0. Exit");
            System.out.println("==============================");
            System.out.print("Masukkan pilihan : ");
            pilihanInt = input18.nextInt();

            switch (pilihanInt) {
                case 1:
                    System.out.print("\nMasukkan Nomor Transaksi: ");
                    int nomorTransaksi = input18.nextInt();
                    System.out.print("Masukkan Tanggal Pembelian: ");
                    String tanggalPembelian = input18.next();
                    System.out.print("Masukkan Jumlah Barang: ");
                    int jumlahBarang = input18.nextInt();
                    System.out.print("Masukkan Total Harga Bayar: ");
                    double totalHargaBayar = input18.nextDouble();

                    StrukBelanja strukBaru = new StrukBelanja(nomorTransaksi, tanggalPembelian, jumlahBarang,
                            totalHargaBayar);
                    stackStruk.push(strukBaru);
                    System.out.println("Struk belanja berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.print(
                            "\nBerapa banyak struk belanja yang ingin Anda tarik untuk ditukarkan dengan voucher? ");
                    int jumlahStrukDitukar = input18.nextInt();

                    System.out.println("\nStruk Belanja yang Ditarik untuk Ditukarkan dengan Voucher:");
                    for (int i = 0; i < jumlahStrukDitukar; i++) {
                        StrukBelanja struk = stackStruk.pop();
                        if (struk != null) {
                            System.out.println(struk);
                        } else {
                            System.out.println("StackStruk kosong, tidak bisa melakukan penarikan lebih lanjut.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("============================================================");
                    System.out.println("      Informasi Struk Belanja yang Masih Tersimpan:");
                    System.out.println("============================================================");
                    stackStruk.display();
                    break;
                case 0:
                    System.out.println("==============================");
                    System.out.println("    Keluar dari program.");
                    System.out.println("==============================");
                    break;
                default:
                    System.out.println("==============================");
                    System.out.println(" Masukkan pilihan yang BENAR");
                    break;
            }

        } while (pilihanInt != 0);
    }
}
