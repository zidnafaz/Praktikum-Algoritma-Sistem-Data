package src;
import java.util.Scanner;

public class Tugas1_18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("        Plat Nomor Indonesia");
        System.out.println("====================================");
        System.out.print("Masukkan Huruf Plat Nomor   : ");
        char inputanHuruf = input18.next().charAt(0);

        hurufPlatNomor(inputanHuruf);

    }

    static void hurufPlatNomor(char inputanHuruf) {
        char huruf[] = {'A','B','D','E','F','G','H','L','N','T'};
        char daerah[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        boolean hurufFound = false;
        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] == inputanHuruf) {
                hurufFound = true;
                System.out.print("Plat Nomor Huruf " + inputanHuruf + " Berasal dari ");
                for (int j = 0; j < daerah[i].length; j++) {
                    System.out.print(daerah[i][j]);
                }
                System.out.println(); 
                break;
            }
        }

        if (!hurufFound) {
            System.out.println("Huruf yang anda masukkan tidak terdaftar, masukkan kembali");
            main(null);
        }

    }
}
