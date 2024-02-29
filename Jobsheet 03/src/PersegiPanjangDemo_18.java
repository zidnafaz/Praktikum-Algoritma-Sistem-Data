import java.util.Scanner;

public class PersegiPanjangDemo_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Tentukan Jumlah Persegi     : ");
        int panjangArray = input18.nextInt();
        PersegiPanjang_18[] arrayOfPersegiPanjang = new PersegiPanjang_18[panjangArray];

        int panjang = 0, lebar = 0;

        // Percobaan 1

        // arrayOfPersegiPanjang[0] = new PersegiPanjang_18();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang_18();
        // arrayOfPersegiPanjang[1].panjang = 80;
        // arrayOfPersegiPanjang[1].lebar = 40;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang_18();
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1\nPanjang : " +
        // arrayOfPersegiPanjang[0].panjang + "\nLebar : "
        // + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-2\nPanjang : " +
        // arrayOfPersegiPanjang[1].panjang + "\nLebar : "
        // + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-3\nPanjang : " +
        // arrayOfPersegiPanjang[2].panjang + "\nLebar : "
        // + arrayOfPersegiPanjang[2].lebar);

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
                        
            System.out.println("\nPersegi panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang    : ");
            panjang = input18.nextInt();
            System.out.print("Masukkan Lebar      : ");
            lebar = input18.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang_18(panjang, lebar);
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }

        // for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
        //     System.out.println("\nPersegi Panjang ke-" + (i + 1) + "\nPanjang   : " + arrayOfPersegiPanjang[i].panjang
        //             + "\nLebar     : " + arrayOfPersegiPanjang[i].lebar);
        // }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}
