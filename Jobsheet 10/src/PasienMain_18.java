import java.util.Scanner;

public class PasienMain_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        Scanner inputString18 = new Scanner(System.in);

        System.out.print("Masukan kapasitas antrian   : ");
        int jumlah = input18.nextInt();

        QueuePasien_18 antri = new QueuePasien_18(jumlah);

        int pilihan = 0;
        do {
            menu();
            pilihan = input18.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("           MASUKKAN DATA DIRI");
                    System.out.println("========================================");
                    System.out.print("Nama Pasien           : ");
                    String nama = inputString18.nextLine();
                    System.out.print("Nomor ID              : ");
                    int noID = input18.nextInt();
                    System.out.print("Jenis Kelamin (P/L)   : ");
                    char jenisKelamin = input18.next().charAt(0);
                    System.out.print("Umur                  : ");
                    int umur = input18.nextInt();
                    input18.nextLine();
                    Pasien_18 nb = new Pasien_18(nama, noID, jenisKelamin, umur);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Pasien_18 data = antri.Dequeue();
                    if (!"".equalsIgnoreCase(data.nama) && data.noID != 0
                            && !Character.isWhitespace(data.jenisKelamin)
                            && (data.jenisKelamin == 'L' || data.jenisKelamin == 'P')
                            && data.umur != 0) {
                        System.out.println("========================================");
                        System.out.println("          ANTRIAN YANG KELUAR");
                        System.out.println("========================================");
                        System.out.println("Nama           : " + data.nama);
                        System.out.println("Nomor ID       : " + data.noID);
                        System.out.println("Jenis Kelamin  : " + data.jenisKelamin);
                        System.out.println("Umur           : " + data.umur);
                    }

                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.println("========================================");
                    System.out.print("Masukkan nama pasien    : ");
                    String cariNama = inputString18.nextLine();
                    System.out.println("========================================");
                    antri.peekPosition(cariNama);
                    break;
                case 6:
                    antri.daftarPasien();
                    break;
                default:
                    break;
            }
        } while (pilihan != 7);

        input18.close();
        inputString18.close();

    }

    public static void menu() {
        System.out.println("========================================");
        System.out.println("                  MENU");
        System.out.println("========================================");
        System.out.println("1. Pasien Baru");
        System.out.println("2. Pasien Keluar");
        System.out.println("3. Cek Pasien Terdepan");
        System.out.println("4. Cek Pasien Terbelakang");
        System.out.println("5. Cari Pasien Dengan Nama");
        System.out.println("6. Cek Semua Daftar Pasien");
        System.out.println("7. Keluar");
        System.out.println("========================================");
    }
}
