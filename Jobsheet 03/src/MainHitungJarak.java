import java.util.Scanner;

public class MainHitungJarak {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        HitungJarak[] arrayOfHitungJarak = new HitungJarak[3];

        String alamatPenerima = "";
        String alamatPengirim = "";
        int jarak;

        for (int i = 0; i < arrayOfHitungJarak.length; i++) {

            System.out.println("\nData Pengiriman Ke-" + (i + 1));
            
            System.out.print("Masukkan alamat Pengirim    : ");
            alamatPengirim = input18.nextLine();
            System.out.print("Masukkan alamat Penerima    : ");
            alamatPenerima = input18.nextLine();

            arrayOfHitungJarak[i] = new HitungJarak(alamatPenerima, alamatPengirim);
            arrayOfHitungJarak[i].hitungJarak();

        }

        for (int i = 0; i < arrayOfHitungJarak.length; i++) {
            System.out.println("\nData Pengiriman Ke-" + (i + 1));
            arrayOfHitungJarak[i].tampilkanJarak();
        }
    }
}
