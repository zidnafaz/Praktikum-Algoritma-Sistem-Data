package program;

public class TransaksiPajak {

    private static int kodeCounter = 1;
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    public TransaksiPajak(long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kodeCounter++;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }

    @Override
    public String toString() {
        return " | " + kode + "\t | " + kendaraan.noTNKB + "\t | " + kendaraan.nama +  "\t\t | " + nominalBayar + "\t\t | " + denda + "\t\t | ";
    }
}
