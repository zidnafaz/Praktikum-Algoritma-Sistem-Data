public class Mahasiswa_18 {
    
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa_18(int nim, String nama, int umur, double ipk) {
    
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;

    }

    void Tampil() {

        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("IPK     : " + ipk);

    }

}