import java.util.Scanner;

public class QueueMain_18 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue  : ");
        int n = input18.nextInt();

        Queue_18 Q = new Queue_18(n);

        int pilihan = 0;
        do {
            menu();
            pilihan = input18.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data baru  : ");
                    int dataMasuk = input18.nextInt();
                    Q.Enqueue(dataMasuk);
                    checkProgram(Q);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan   : " + dataKeluar);
                    }
                    checkProgram(Q);
                    break;

                case 3:
                    Q.print();
                    checkProgram(Q);
                    break;

                case 4:
                    Q.peek();
                    checkProgram(Q);
                    break;

                case 5:
                    Q.clear();
                    checkProgram(Q);
                    break;

                default:
                    break;
            }
        } while (pilihan != 6 && !Q.isStopped());

        input18.close();

    }

    public static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Keluar");
        System.out.println("-------------------------------------------");
    }

    public static void checkProgram(Queue_18 Q) {
        if (Q.isStopped()) {
            System.out.println("Program dihentikan karena queue overflow atau queue underflow!");
        }
    }
}
