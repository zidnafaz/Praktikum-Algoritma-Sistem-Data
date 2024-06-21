package ProgramNonCollection;

public class Transaksi_18 {
    static int counter = 1;
    int idTransaksi;
    Pelanggan_18 pelanggan;
    String jenisLayanan;
    double jumlah;
    double harga;

    public Transaksi_18(Pelanggan_18 pelanggan, String jenisLayanan, double jumlah, double harga) {
        this.idTransaksi = counter++;
        this.pelanggan = pelanggan;
        this.jenisLayanan = jenisLayanan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "| " + idTransaksi + "\t| " + pelanggan.namaPelanggan + "\t\t\t| " + jenisLayanan + "\t| " + jumlah + "\t\t| " + harga + "\t|";
    }
}
