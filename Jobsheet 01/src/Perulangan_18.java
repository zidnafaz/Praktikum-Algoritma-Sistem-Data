package src;

import java.util.Scanner;

public class Perulangan_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.print("Masukkan NIM  : ");
        String nim = scanner.nextLine();
        System.out.println("=============================");
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }
        
        System.out.println("Nilai n       : " + n);

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
