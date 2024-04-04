import java.util.Scanner;

public class StackMainPakaian_18 {

    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);
        Scanner input18String = new Scanner(System.in);

        StackPakaian_18 stack = new StackPakaian_18(5);
        char pilihan;
        int pilihanInt = 0;

        do {

            System.out.println("==============================");
            System.out.println("            MENU");
            System.out.println("==============================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("0. Exit");
            System.out.println("==============================");
            System.out.print("Masukkan pilihan : ");
            pilihanInt = input18.nextInt();

            switch (pilihanInt) {
                case 1:
                    do {
                        if (stack.isFull()) {
                            System.out.println("Stack sudah penuh!");
                            break;
                        }

                        System.out.print("\nJenis     : ");
                        String jenis = input18String.nextLine();
                        System.out.print("Warna     : ");
                        String warna = input18String.nextLine();
                        System.out.print("Merk      : ");
                        String merk = input18String.nextLine();
                        System.out.print("Ukuran    : ");
                        String ukuran = input18String.nextLine();
                        System.out.print("Harga     : ");
                        double harga = input18.nextDouble();

                        Pakaian_18 pakaian = new Pakaian_18(jenis, warna, merk, ukuran, harga);

                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)?  : ");
                        pilihan = input18.next().charAt(0);

                        stack.push(pakaian);

                    } while (pilihan == 'y');
                    break;
                case 2:
                    System.out.println("==============================");
                    stack.pop();
                    break;
                case 3:
                    System.out.println("==============================");
                    stack.peek();
                    break;
                case 4:
                    System.out.println("==============================");
                    stack.print();
                    break;
                case 0:
                    System.out.println("==============================");
                    System.out.println("    Keluar dari program.");
                    System.out.println("==============================");
                    break;
                default:
                    System.out.println("==============================");
                    System.out.println(" Masukkan pilihan yang BENAR");
                    break;
            }

        } while (pilihanInt != 0);

    }

}
