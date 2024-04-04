import java.util.Scanner;

public class StackMainPakaian_18 {
    
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        StackPakaian_18 stack = new StackPakaian_18(5);
        char pilihan;

        do {

            System.out.print("Jenis     : ");
            String jenis = input18.nextLine();
            System.out.print("Warna     : ");
            String warna = input18.nextLine();
            System.out.print("Merk      : ");
            String merk = input18.nextLine();
            System.out.print("Ukuran    : ");
            String ukuran = input18.nextLine();
            System.out.print("Harga     : ");
            double harga = input18.nextDouble();

            Pakaian_18 pakaian = new Pakaian_18(jenis, warna, merk, ukuran, harga);

            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)?  : ");
            pilihan = input18.next().charAt(0);
            input18.nextLine();

            stack.push(pakaian);

        } while (pilihan == 'y');

        stack.print();
        stack.pop();
        stack.peek();
        stack.print();
    
    }

}
