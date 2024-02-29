import java.util.Scanner;

public class MainHitungJarak {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        String alamatPenerima;
        String alamatPengirim;

        System.out.print("Masukkan alamat Pengirim    : ");
        alamatPengirim = input18.nextLine();
        System.out.print("Masukkan alamat Penerima    : ");
        alamatPenerima = input18.nextLine();

        HitungJarak HitungJarak1 = new HitungJarak(alamatPenerima, alamatPengirim);
        HitungJarak1.Jarak(alamatPenerima, alamatPengirim);
        HitungJarak1.tampilkanJarak();
    }
}
