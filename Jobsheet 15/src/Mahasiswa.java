public class Mahasiswa {

    String nim;
    String nama;
    String noTelp;

    public Mahasiswa() {
        
    }

    public Mahasiswa(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override

    public String toString() {
        return "Mahasiswa{" + " Nim = " + nim + ", Nama = " + nama + ", No Telp = " + noTelp + '}';
    }

}