public class TransaksiBarang_18 {
    private Barang_18[] barangs;
    private int jumlahBarang;

    public TransaksiBarang_18() {
        this.barangs = new Barang_18[10];
        this.jumlahBarang = 0;
    }

    public void tambahBarang(Barang_18 barang) {
        if (jumlahBarang < barangs.length) {
            barangs[jumlahBarang] = barang;
            jumlahBarang++;
        } else {
            System.out.println("Transaksi penuh, tidak bisa menambah barang lagi.");
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("\n| Kode       | Nama       | Harga      | Stok       |");
        for (int i = 0; i < jumlahBarang; i++) {
            barangs[i].TampilkanBarang();
        }
    }

    public Barang_18 cariBarangByKode(int kode) {
        for (int i = 0; i < jumlahBarang; i++) {
            if (barangs[i].kode_barang == kode) {
                return barangs[i];
            }
        }
        return null;
    }
}
