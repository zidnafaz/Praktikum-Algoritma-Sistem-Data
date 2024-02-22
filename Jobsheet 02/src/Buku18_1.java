public class Buku18_1 {
    String judul, pengarang, pesan;
    int halaman, stok, harga;

    public Buku18_1() {

    }

    public Buku18_1(String jud, String pg, int hlm, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hlm;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {

        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        pesan = getStok();
        System.out.println("Sisa Stok : " + pesan);
        System.out.println("Harga : Rp" + harga);

    }

    public String getStok() {
        pesan = "" + stok;
        return pesan;
    }

    String terjual(Integer jml) {
        stok -= jml;        

        if (stok <= 0) {
            pesan = "Maaf, stok buku ini kosong atau jumlah yang diminta melebihi stok yang tersedia."; 
        } else {
            pesan = "" + stok;
        }

        return pesan;
    }

    void restok(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jumlah) {
        return jumlah * harga;
    }

    int hitungDiskon(int hargaTotal) {

        int diskon = 0;

        if (hargaTotal > 150000) {
            diskon = (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int) (hargaTotal * 0.02);
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}