import java.util.Scanner;
import java.text.DecimalFormat;

public class MainNilaiMahasiswa_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        NilaiMahasiswa_18[] arrayOfNilaimahasiswa = new NilaiMahasiswa_18[3];
        String nama = "", jenisKelamin = "";
        int NIM = 0;
        double IPK = 0, reRata = 0;

        for (int i = 0; i < arrayOfNilaimahasiswa.length; i++) {
            System.out.println("\nMasukkan Data Mahasiswa Ke-" + (i + 1));

            System.out.print("Masukkan Nama Mahasiswa     : ");
            nama = input18.nextLine();
            System.out.print("Masukkan NIM Mahasiswa      : ");
            NIM = input18.nextInt();
            input18.nextLine();
            System.out.print("Masukkan Jenis kelamin      : ");
            jenisKelamin = input18.nextLine();
            System.out.print("Masukkan IPK Mahasiswa      : ");
            IPK = input18.nextDouble();
            input18.nextLine();

            arrayOfNilaimahasiswa[i] = new NilaiMahasiswa_18(nama, NIM, jenisKelamin, IPK);

        }

        int index = 1;
        for (NilaiMahasiswa_18 mahasiswa : arrayOfNilaimahasiswa) {
            System.out.println("\nData Mahasiswa Ke-" + index++);
            mahasiswa.displayNilaiMahasiswa();
        }

        for (int i = 0; i < arrayOfNilaimahasiswa.length; i++) {
            reRata += arrayOfNilaimahasiswa[i].hitungRerata();
        }

        reRata /= arrayOfNilaimahasiswa.length;

        DecimalFormat df = new DecimalFormat("#.#");
        String bulatkan = df.format(reRata);

        System.out.println("Rata-rata Seluruh IPK Mahasiswa adalah " + bulatkan);

    }
}
