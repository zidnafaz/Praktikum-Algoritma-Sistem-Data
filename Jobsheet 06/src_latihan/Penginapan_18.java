public class Penginapan_18 {
    
    String nama;
    int harga;
    double rating;
    String alamat;

    Penginapan_18(String nama, int harga, double rating, String alamat) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
        this.alamat = alamat;
    }

    void tampil() {
        System.out.println("Nama Penginapan : " + nama);
        System.out.println("Harga           : " + harga);
        System.out.println("Rating          : " + rating);
        System.out.println("Alamat          : " + alamat);
    }

}
