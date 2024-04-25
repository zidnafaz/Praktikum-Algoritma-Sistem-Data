import java.util.Scanner;

public class NasabahMain_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        Scanner inputString18 = new Scanner(System.in);
        
        System.out.print("Masukan kapasitas antrian   : ");
        int jumlah = input18.nextInt();

        QueueNasabah_18 antri = new QueueNasabah_18(jumlah);

        int pilihan = 0;
        do {
            menu();
            pilihan = input18.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("           MASUKKAN DATA DIRI");
                    System.out.println("========================================");
                    System.out.print("Nomor Rekening : ");
                    String norek = inputString18.nextLine();
                    System.out.print("Nama           : ");
                    String nama = inputString18.nextLine();
                    System.out.print("Alamat         : ");
                    String alamat = inputString18.nextLine();
                    System.out.print("Umur           : ");
                    int umur = input18.nextInt();
                    input18.nextLine();
                    System.out.print("Saldo          : ");
                    double saldo = input18.nextDouble();
                    input18.nextLine();
                    Nasabah_18 nb = new Nasabah_18(norek, nama, alamat, umur, saldo);
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah_18 data = antri.Dequeue();
                    if (!"".equalsIgnoreCase(data.norek) && !"".equalsIgnoreCase(data.nama)
                            && !"".equalsIgnoreCase(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("========================================");
                        System.out.println("          ANTRIAN YANG KELUAR");
                        System.out.println("========================================");
                        System.out.println("Nomor Rekening : " + data.norek);
                        System.out.println("Nama           : " + data.nama);
                        System.out.println("Alamat         : " + data.alamat);
                        System.out.println("Umur           : " + data.umur);
                        System.out.println("Saldo          : " + data.saldo);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                default:
                    break;
            }
        } while (pilihan != 5);
    }

    public static void menu() {
        System.out.println("========================================");
        System.out.println("                  MENU");
        System.out.println("========================================");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Keluar");
        System.out.println("========================================");
    }
}
