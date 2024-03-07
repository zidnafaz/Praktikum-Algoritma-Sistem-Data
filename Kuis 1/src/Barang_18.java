
public class Barang_18 {

    public String nama;
    public int kode_barang;
    public int harga;
    public int stok;

    public Barang_18(String nama, int kode_barang, int harga, int stok) {

        this.nama = nama;
        this.kode_barang = kode_barang;
        this.harga = harga;
        this.stok = stok;

    }

    public void TampilkanBarang() {
        System.out.printf("| %-10s | %-10s | %-10s | %-10s |\n", kode_barang, nama, harga, stok);
    }
    
}