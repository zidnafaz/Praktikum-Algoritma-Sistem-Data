import java.util.Scanner;

public class PersegiPanjangDemo_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        PersegiPanjang_18[] arrayOfPersegiPanjang = new PersegiPanjang_18[3];

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
            arrayOfPersegiPanjang[i] = new PersegiPanjang_18();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang    : ");
            arrayOfPersegiPanjang[i].panjang = input18.nextInt();
            System.out.print("Masukkan Lebar      : ");
            arrayOfPersegiPanjang[i].lebar = input18.nextInt();
            System.out.println();
        }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("\nPersegi Panjang ke-" + (i + 1) + "\nPanjang   : " + arrayOfPersegiPanjang[i].panjang
                    + "\nLebar     : " + arrayOfPersegiPanjang[i].lebar);
        }
    }
}
