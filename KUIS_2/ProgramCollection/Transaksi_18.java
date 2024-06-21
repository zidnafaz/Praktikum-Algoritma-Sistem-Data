package ProgramCollection;

public class Transaksi_18 {
    
    public static int idTransaksiCounter = 1;
    int idTransaksi;
    Pelanggan_18 Pelanggan;
    String jenisLayanan;
    double berat;
    double harga;

    public Transaksi_18(Pelanggan_18 Pelanggan, String jenisLayanan, double berat, double harga) {
        this.idTransaksi = idTransaksiCounter++;
        this.Pelanggan = Pelanggan;
        this.jenisLayanan = jenisLayanan;
        this.berat = berat;
        this.harga = harga;
    }

    @Override

    public String toString() {
        return "| " + idTransaksi + "\t| " + Pelanggan.namaPelanggan + "\t\t\t| " + jenisLayanan + "\t| " + berat + "\t\t| " + harga + "\t|";
    }

}
