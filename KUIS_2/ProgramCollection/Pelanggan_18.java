package ProgramCollection;

public class Pelanggan_18 {

    int idPelanggan;
    String namaPelanggan;
    String noTelp;

    public Pelanggan_18(int idPelanggan, String namaPelanggan, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.noTelp = noTelp;
    }

    @Override

    public String toString() {
        return "| " + idPelanggan + "\t| " + namaPelanggan + "\t\t| " + noTelp + "\t\t|";
    }

}