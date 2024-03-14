import java.util.Scanner;

public class MainHitungAkar {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.print("Masukkan bilangan           : ");
        double bilangan = input18.nextDouble();
        
        double akarBruteForce = HitungAkar.BruteForce(bilangan);
        double akarDivideConquer = HitungAkar.DivideConquer(bilangan);
        
        System.out.println("==================================");
        System.out.println("Akar dengan Brute Force     : " + akarBruteForce);
        System.out.println("Akar dengan Divide Conquer  : " + akarDivideConquer);
        System.out.println("==================================");

    }
}
