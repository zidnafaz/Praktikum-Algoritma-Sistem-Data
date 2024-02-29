public class NilaiMahasiswa_18 {

    public String nama;
    public int NIM;
    public String jenisKelamin;
    public double IPK;
    public double reRata;

    public NilaiMahasiswa_18(String nama, int NIM, String jenisKelamin, double IPK) {

        this.nama = nama;
        this.NIM = NIM;
        this.jenisKelamin = jenisKelamin;
        this.IPK = IPK;

    }

    public void displayNilaiMahasiswa() {

        System.out.println("Nama Mahasiswa      : " + nama);
        System.out.println("NIM Mahasiswa       : " + NIM);
        System.out.println("Jenis Kelamin       : " + jenisKelamin);
        System.out.println("IPK Mahasiswa       : " + IPK);

    }

    public double getIPK() {
        return IPK;
    }

    public double hitungRerata() {
        return IPK;
    }
}
