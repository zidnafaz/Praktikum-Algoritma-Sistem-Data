public class BukuMain18_1 {
    public static void main(String[] args) {

        Buku18_1 bk1 = new Buku18_1();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku18_1 bk2 = new Buku18_1("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku18_1 bukuFaza = new Buku18_1("Why Me", "M. Z. Bilah Faza", 177, 100, 89000);
        bukuFaza.terjual(78);
        bukuFaza.tampilInformasi();

        Buku18_1 bk3 = new Buku18_1("Sebuah Seni untuk Bersikap Bodo Amat", "Mark Manson", 246, 100, 85000);
        int stokTerjual = 26;
        bk3.terjual(stokTerjual);
        int hargaTotal = bk3.hitungHargaTotal(stokTerjual);
        int diskon = bk3.hitungDiskon(hargaTotal);
        int hargaBayar = bk3.hitungHargaBayar(hargaTotal, diskon);
        bk3.tampilInformasi();

        System.out.println("Jumlah diskon sebesar Rp" + diskon);
        System.out.println("Jumlah Harga Total Rp" + hargaTotal);
        System.out.println("Jumlah Harga Bayar Rp" + hargaBayar);
        
    }
}