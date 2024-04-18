import java.util.Scanner;
import java.util.Random;

public class MainTransaksi_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rekening_18[] rekenings = new Rekening_18[100];
        Transaksi_18[] transaksis = new Transaksi_18[100];

        // Data Rekening
        rekenings[0] = new Rekening_18("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263",
                "ligula.Nullam@tacitisociosqu.edu");
        rekenings[1] = new Rekening_18("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547",
                "nec@lectusjusto.org");
        rekenings[2] = new Rekening_18("16240401 2243", "Fuller", "Finn Dunlap", "571-7062",
                "convallis@Vestibulumanteipsum.org");
        rekenings[3] = new Rekening_18("16270525 0112", "Malcolm", "Keane Floyd", "623-0234",
                "porttitor.tellus.non@Curabitur.ca");
        rekenings[4] = new Rekening_18("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323",
                "ut.pellentesque@luctusutpellentesque.com");
        rekenings[5] = new Rekening_18("16100727 8862", "Rudyard", "Charles Morales", "650-5379",
                "Proin.eget@velitegestaslacinia.ca");
        rekenings[6] = new Rekening_18("16460329 4259", "Troy", "Damon Guerra", "897-7608",
                "pede.Suspendisse.dui@a.ca");
        rekenings[7] = new Rekening_18("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com");
        rekenings[8] = new Rekening_18("16180729 7229", "Walter", "Seth Drake", "863-8209",
                "Pellentesque.ut.ipsum@neque.ca");
        rekenings[9] = new Rekening_18("16950313 6823", "Simon", "Burton Gates", "592-6919",
                "tellus.justo.sit@commodoauctor.net");
        rekenings[10] = new Rekening_18("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu");
        rekenings[11] = new Rekening_18("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664",
                "vel@ullamcorpermagna.co.uk");
        rekenings[12] = new Rekening_18("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110",
                "Aliquam.gravida@vestibulumMauris.net");
        rekenings[13] = new Rekening_18("16130909 2979", "Ryder", "Joel Cunningham", "817-1766",
                "interdum.Curabitur.dictum@rutrumurna.edu");
        rekenings[14] = new Rekening_18("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501",
                "et.ultrices@a.co.uk");
        rekenings[15] = new Rekening_18("16141008 9963", "Alec", "Baker Barton", "527-9085",
                "ut@aultriciesadipiscing.ca");
        rekenings[16] = new Rekening_18("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285",
                "Proin.velit@Duisac.net");
        rekenings[17] = new Rekening_18("16720623 0943", "Devin", "Slade Flores", "977-6690",
                "ac@nibhAliquamornare.com");
        rekenings[18] = new Rekening_18("16771126 7372", "Ignatius", "Lionel Kane", "353-5137",
                "cubilia.Curae.Phasellus@Duis.com");

        // Data Transaksi
        transaksis[0] = new Transaksi_18("16030927 3084", 3587, 494048, 898214, "2021-03-09 07:54:42", "Debit");
        transaksis[1] = new Transaksi_18("16100617 0573", 775880, 200162, 205420, "2021-06-25 10:23:00", "Kredit");
        transaksis[2] = new Transaksi_18("16240401 2243", 328316, 350929, 838632, "2021-09-18 23:00:04", "Debit");
        transaksis[3] = new Transaksi_18("16270525 0112", 690503, 204434, 230659, "2022-02-02 19:10:34", "Kredit");
        transaksis[4] = new Transaksi_18("16971204 2416", 444267, 334245, 770592, "2020-08-11 13:36:56", "Debit");
        transaksis[5] = new Transaksi_18("16100727 8862", 376442, 451002, 685302, "2020-05-23 07:34:53", "Kredit");
        transaksis[6] = new Transaksi_18("16460329 4259", 597842, 851403, 816129, "2021-07-18 19:41:20", "Debit");
        transaksis[7] = new Transaksi_18("16320421 3437", 802752, 333823, 989609, "2022-02-01 01:13:11", "Kredit");
        transaksis[8] = new Transaksi_18("16180729 7229", 779589, 396116, 297103, "2021-07-03 01:09:49", "Debit");
        transaksis[9] = new Transaksi_18("16950313 6823", 619774, 259150, 66190, "2021-09-09 03:57:30", "Kredit");
        transaksis[10] = new Transaksi_18("16850708 3528", 547922, 278309, 234301, "2021-08-24 13:18:39", "Debit");
        transaksis[11] = new Transaksi_18("16080205 9329", 50283, 869468, 243306, "2021-03-12 03:40:16", "Kredit");
        transaksis[12] = new Transaksi_18("16080628 2695", 602034, 991242, 371045, "2021-08-06 11:48:59", "Debit");
        transaksis[13] = new Transaksi_18("16130909 2979", 472273, 97058, 395170, "2021-05-02 10:53:31", "Kredit");
        transaksis[14] = new Transaksi_18("16890212 8688", 109431, 561908, 862731, "2021-07-31 08:11:00", "Debit");
        transaksis[15] = new Transaksi_18("16141008 9963", 725426, 31387, 556798, "2021-03-27 06:18:20", "Kredit");
        transaksis[16] = new Transaksi_18("16511222 7763", 846142, 896213, 873982, "2021-07-18 04:06:30", "Debit");
        transaksis[17] = new Transaksi_18("16720623 0943", 775848, 739406, 774247, "2020-10-24 01:39:00", "Kredit");
        transaksis[18] = new Transaksi_18("16771126 7372", 868772, 823014, 66987, "2020-12-21 05:57:59", "Debit");

        int rekeningCount = 19;
        int transaksiCount = 19;

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data Rekening");
            System.out.println("2. Tampilkan Data Transaksi");
            System.out.println("3. Tampilkan Saldo Kurang dari 50000");
            System.out.println("4. Urutkan Data Rekening Berdasarkan Nama (A-Z)");
            System.out.println("5. Tambah Nomor Rekening Baru");
            System.out.println("6. Tambah Transaksi Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    tampilkanDataRekening(rekenings, rekeningCount);
                    break;
                case 2:
                    tampilkanDataTransaksi(rekenings, transaksis, rekeningCount, transaksiCount);
                    break;
                case 3:
                    tampilkanSaldoKurangDari50000(transaksis, transaksiCount);
                    break;
                case 4:
                    urutkanDataRekening(rekenings, rekeningCount);
                    tampilkanDataRekening(rekenings, rekeningCount);
                    break;
                case 5:
                    tambahNomorRekeningBaru(rekenings, scanner, rekeningCount);
                    rekeningCount++;
                    break;
                case 6:
                    tambahTransaksiBaru(rekenings, transaksis, scanner, rekeningCount, transaksiCount);
                    transaksiCount++;
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private static void tampilkanDataRekening(Rekening_18[] rekenings, int count) {
        System.out.println("\nData Rekening:");
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
        System.out.println(
                "|   No Rekening     |         Nama         |       Nama Ibu      |      Phone       |          Email         |");
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
        for (int i = 0; i < count; i++) {
            System.out.printf("| %-17s | %-20s | %-19s | %-16s | %-22s |\n", rekenings[i].noRekening, rekenings[i].nama,
                    rekenings[i].namaIbu, rekenings[i].telp, rekenings[i].email);
        }
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
    }

    private static void tampilkanDataTransaksi(Rekening_18[] rekenings, Transaksi_18[] transaksis, int rekeningCount,
            int transaksiCount) {
        System.out.println("\nData Transaksi:");
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+-------------+------------------------+");
        System.out.println(
                "|   No Rekening     |     Tanggal Transaksi    |  Saldo Awal   |  Saldo Akhir  |    Saldo    |   Jenis Transaksi   |");
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+-------------+------------------------+");
        for (int i = 0; i < transaksiCount; i++) {
            String currentNoRekening = transaksis[i].noRekening;
            boolean rekeningFound = false;
            for (int j = 0; j < rekeningCount; j++) {
                if (currentNoRekening.equals(rekenings[j].noRekening)) {
                    System.out.printf("| %-17s | %-22s | %-15.2f | %-15.2f | %-11.2f | %-20s |\n", currentNoRekening,
                            transaksis[i].tanggalTransaksi, transaksis[i].saldoAwal, transaksis[i].saldoAkhir,
                            transaksis[i].saldo, transaksis[i].type);
                    rekeningFound = true;
                    break;
                }
            }
            if (!rekeningFound) {
                System.out.println("| " + currentNoRekening + " | Tidak ditemukan dalam data rekening |");
            }
        }
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+-------------+------------------------+");
    }

    private static void tampilkanSaldoKurangDari50000(Transaksi_18[] transaksis, int count) {
        System.out.println("\nSaldo Kurang dari 50000:");
        System.out.println("+-------------------+---------------------+-------------+");
        System.out.println("|   No Rekening     |  Tanggal Transaksi  |    Saldo    |");
        System.out.println("+-------------------+---------------------+-------------+");
        for (int i = 0; i < count; i++) {
            if (transaksis[i].saldo < 500000) {
                System.out.printf("| %-17s | %-19s | %-11.2f |\n", transaksis[i].noRekening,
                        transaksis[i].tanggalTransaksi, transaksis[i].saldo);
            }
        }
        System.out.println("+-------------------+---------------------+-------------+");
    }

    private static void urutkanDataRekening(Rekening_18[] rekenings, int count) {
        
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rekenings[j].nama.compareTo(rekenings[j + 1].nama) > 0) {
                    Rekening_18 temp = rekenings[j];
                    rekenings[j] = rekenings[j + 1];
                    rekenings[j + 1] = temp;
                }
            }
        }
        System.out.println("Data Rekening telah diurutkan berdasarkan nama (A-Z).");
    }

    private static void tambahNomorRekeningBaru(Rekening_18[] rekenings, Scanner scanner, int count) {
        System.out.println("\nMasukkan Data Nomor Rekening Baru:");
        String noRekening = generateNomorRekening();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Nama Ibu: ");
        String namaIbu = scanner.nextLine();
        System.out.print("Phone: ");
        String telp = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        rekenings[count] = new Rekening_18(noRekening, nama, namaIbu, telp, email);

        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
        System.out.println(
                "|   No Rekening     |         Nama         |       Nama Ibu      |      Phone       |          Email         |");
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
        System.out.printf("| %-17s | %-20s | %-19s | %-16s | %-22s |\n", noRekening, nama, namaIbu, telp, email);
        System.out.println(
                "+-------------------+----------------------+---------------------+------------------+------------------------+");
        System.out.println("Nomor Rekening baru berhasil ditambahkan.");
    }

    private static String generateNomorRekening() {
        StringBuilder nomorRekening = new StringBuilder("16");
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            nomorRekening.append(random.nextInt(12));
        }
        
        nomorRekening.insert(nomorRekening.length() - 4, ' ');
        return nomorRekening.toString();
    }

    private static void tambahTransaksiBaru(Rekening_18[] rekenings, Transaksi_18[] transaksis, Scanner scanner,
            int rekeningCount, int transaksiCount) {
        System.out.println("\nMasukkan Data Transaksi Baru:");
        System.out.print("No Rekening: ");
        String noRekening = scanner.nextLine();

        boolean validNomorRekening = false;
        double saldoAwal = 0.0;
        double saldoAkhir = 0.0;
        for (int i = 0; i < transaksiCount; i++) {
            if (noRekening.equals(transaksis[i].noRekening)) {
                validNomorRekening = true;
                saldoAwal = transaksis[i].saldoAkhir;
                saldoAkhir = saldoAwal;
                break;
            }
        }

        if (!validNomorRekening) {
            System.out.println("Nomor rekening tidak valid.");
            return;
        }

        System.out.print("Pilih jenis transaksi (1: Setor, 2: Tarik): ");
        int jenisTransaksi = scanner.nextInt();

        double jumlahUang = 0.0;

        switch (jenisTransaksi) {
            case 1:
                System.out.print("Jumlah uang: ");
                jumlahUang = scanner.nextDouble();
                saldoAkhir += jumlahUang;
                break;
            case 2:
                System.out.print("Jumlah uang: ");
                jumlahUang = scanner.nextDouble();
                saldoAkhir -= jumlahUang;
                break;
            default:
                System.out.println("Pilihan transaksi tidak valid.");
                return;
        }

        scanner.nextLine();

        System.out.print("Tanggal Transaksi (yyyy-mm-dd hh:mm:ss): ");
        String tanggalTransaksi = scanner.nextLine();

        transaksis[transaksiCount] = new Transaksi_18(noRekening, jumlahUang, saldoAwal, saldoAkhir, tanggalTransaksi,
                jenisTransaksi == 1 ? "Debit" : "Kredit");
        System.out.println("Transaksi baru berhasil ditambahkan.");
    }
}
