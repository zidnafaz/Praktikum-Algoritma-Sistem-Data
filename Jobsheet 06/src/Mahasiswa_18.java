public class Mahasiswa_18 {
    
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa_18(String nama, int thnMasuk, int umur, double ipk) {
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("Umur        : " + umur);
        System.out.println("IPK         : " + ipk);
    }
}