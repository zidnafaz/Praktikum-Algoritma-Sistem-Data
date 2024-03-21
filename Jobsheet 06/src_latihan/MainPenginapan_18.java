import java.util.Scanner;

public class MainPenginapan_18 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int pilihan;

        DaftarPenginapan_18 listPenginapan = new DaftarPenginapan_18();

        Penginapan_18 Penginapan1 = new Penginapan_18("DeResort", 585000, 4.2, "Bali");
        Penginapan_18 Penginapan2 = new Penginapan_18("TeVilla", 665000, 3.8, "Bandung");
        Penginapan_18 Penginapan3 = new Penginapan_18("Mutiara Hotel", 360000, 3.2, "Semarang");
        Penginapan_18 Penginapan4 = new Penginapan_18("Bobo Kabin", 405000, 4.7, "Wonosobo");
        Penginapan_18 Penginapan5 = new Penginapan_18("Simple Room", 350000, 4.0, "Bali");

        listPenginapan.tambahPenginapan(Penginapan1);
        listPenginapan.tambahPenginapan(Penginapan2);
        listPenginapan.tambahPenginapan(Penginapan3);
        listPenginapan.tambahPenginapan(Penginapan4);
        listPenginapan.tambahPenginapan(Penginapan5);

        header();
        System.out.println("                Daftar Penginapan");
        header();

        do {
            System.out.println("1. Tampilkan penginapan sebelum sorting");
            System.out.println("2. Tampil penginapan berdasarkan harga (Asc)");
            System.out.println("3. Tampil penginapan berdasarkan harga (Desc)");
            System.out.println("4. Tampil penginapan berdasarkan rating (Asc)");
            System.out.println("5. Tampil penginapan berdasarkan rating (Desc)");
            System.out.println("6. Keluar");
            header();
            System.out.print("Masukkan Pilihan    : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    header();
                    listPenginapan.tampil();
                    header();
                    break;
                case 2:
                    header();
                    System.out.println("   Daftar Penginapan Berdasarkan Harga Termurah");
                    header();
                    listPenginapan.bubbleSortHargaAsc();
                    listPenginapan.tampil();
                    break;
                case 3:
                    header();
                    System.out.println("   Daftar Penginapan Berdasarkan Harga Termahal");
                    header();
                    listPenginapan.bubbleSortHargaDesc();
                    listPenginapan.tampil();
                    break;
                case 4:
                    header();
                    System.out.println("  Daftar Penginapan Berdasarkan Rating Terendah");
                    header();
                    listPenginapan.selectionSortRatingAsc();
                    listPenginapan.tampil();
                    break;
                case 5:
                    header();
                    System.out.println("   Daftar Penginapan Berdasarkan Rating Teratas");
                    header();
                    listPenginapan.selectionSortRatingDesc();
                    listPenginapan.tampil();
                    break;
                case 6:
                    header();
                    System.out.println("                   Terima Kasih");
                    header();
                    break;
                default:
                    System.out.println("               Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 6);

    }

    static void header() {
        System.out.println("==================================================");
    }

}
