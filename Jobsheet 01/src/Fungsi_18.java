package src;

public class Fungsi_18 {

    public static void main(String[] args) {

        String[] cabangToko = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };

        int[][] stockBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };

        double[] hargaBunga = { 75000, 50000, 60000, 10000.0 };

        int[] penguranganStockPerJenisBunga = { 1, 2, 0, 5 };

        hitungDanTampilkanPendapatan(cabangToko, stockBunga, hargaBunga);

        tampilkanStockBungaPerCabang(cabangToko, stockBunga);

        tampilkanStockBungaSetelahDikurangi(cabangToko, stockBunga);
    }

    public static void hitungDanTampilkanPendapatan(String[] cabangToko, int[][] stockBunga, double[] hargaBunga) {
        for (int i = 0; i < cabangToko.length; i++) {
            double pendapatan = 0.0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.printf("Pendapatan %s jika semua bunga habis terjual: Rp%.2f\n", cabangToko[i], pendapatan);
        }
    }

    public static void tampilkanStockBungaPerCabang(String[] cabangToko, int[][] stockBunga) {
        System.out.println("Stock Bunga per Cabang:");
        for (int i = 0; i < cabangToko.length; i++) {
            System.out.println("Cabang " + cabangToko[i]);
            System.out.println("Jenis Bunga\tStock");
            for (int j = 0; j < stockBunga[i].length; j++) {
                String jenisBunga = "";
                switch (j) {
                    case 0:
                        jenisBunga = "Aglonema";
                        break;
                    case 1:
                        jenisBunga = "Keladi";
                        break;
                    case 2:
                        jenisBunga = "Alocasia";
                        break;
                    case 3:
                        jenisBunga = "Mawar";
                        break;
                }
                System.out.printf("%-17s %-14s\n", jenisBunga, stockBunga[i][j]);
            }
            System.out.println();
        }
    }

    public static void kurangiStockBunga(int[][] stockBunga, int[] penguranganStockPerJenisBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] -= penguranganStockPerJenisBunga[j];
            }
        }
    }

    public static void tampilkanStockBungaSetelahDikurangi(String[] cabangToko, int[][] stockBunga) {
        System.out.println("\nStock bunga setelah dikurangi:");
        System.out.println("Cabang Toko\t\tAglonema\tKeladi\t\tAlocasia\tMawar");
        for (int i = 0; i < cabangToko.length; i++) {
            System.out.printf("%s\t\t", cabangToko[i]);
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.printf("%d\t\t", stockBunga[i][j]);
            }
            System.out.println();
        }
    }
}
