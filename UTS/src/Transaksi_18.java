public class Transaksi_18 {
    
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type, noRekening;

    Transaksi_18(String noRekening, double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi,
            String type) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

}