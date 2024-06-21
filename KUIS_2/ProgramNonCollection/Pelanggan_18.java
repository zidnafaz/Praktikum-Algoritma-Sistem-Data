package ProgramNonCollection;

public class Pelanggan_18 {
    int idPelanggan;
    String namaPelanggan;
    String noTelp;

    public Pelanggan_18(int id, String nama, String noTelp) {
        this.idPelanggan = id;
        this.namaPelanggan = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "| " + idPelanggan + "\t| " + namaPelanggan + "\t\t| " + noTelp + "\t\t|";
    }
}
