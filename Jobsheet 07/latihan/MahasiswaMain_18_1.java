import java.util.Scanner;

public class MahasiswaMain_18_1 {
    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);
        Scanner input18Line = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.print("Masukkan jumlah mahasiswa   : ");
        int jumlahMahasiswa = input18.nextInt();
        System.out.println("============================================================");

        PencarianMahasiswa_18_1 data = new PencarianMahasiswa_18_1(jumlahMahasiswa);

        System.out.println("============================================================");
        System.out.println("                  Masukkan data mahasiswa");
        System.out.println("============================================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {

            System.out.print("Nama\t : ");
            String nama = input18Line.nextLine();
            System.out.print("NIM\t : ");
            int nim = input18.nextInt();
            System.out.print("Umur\t : ");
            int umur = input18.nextInt();
            System.out.print("IPK\t : ");
            double ipk = input18.nextDouble();
            System.out.println("============================================================");

            Mahasiswa_18 m = new Mahasiswa_18(nim, nama, umur, ipk);
            data.Tambah(m);

        }

        System.out.println("============================================================");
        System.out.println("                 Data keseluruhan mahasiswa");
        System.out.println("============================================================");
        data.Tampil();

        System.out.println("============================================================");
        System.out.println("                  Pencarian data mahasiswa");
        System.out.println("============================================================");
        System.out.print("Masukkan Nama mahasiswa yang ingin dicari : ");
        String cariNama = input18Line.nextLine();

        System.out.println("============================================================");
        System.out.println("               Menggunakan Binary Search");
        System.out.println("============================================================");
        int posisi = data.FindBinarySearch(cariNama, 0, jumlahMahasiswa - 1);

        data.TampilPosisi(posisi);
        data.TampilData(posisi);
    }
}
