package program;

public class Kendaraan {

    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    @Override
    public String toString() {
        return " | " + noTNKB + "\t | " + nama + "\t\t | " + jenis + "\t\t | " + cc + "\t\t | " + tahun + "\t\t | " + bulanHarusBayar + "\t\t\t | ";
    }
    
}
