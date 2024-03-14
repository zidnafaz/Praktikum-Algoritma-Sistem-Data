import java.util.concurrent.TimeUnit;

public class Faktorial {

    public int nilai;

    public int faktorialBFRekursif(int n) {        

        // SEBELUM PERTANYAAN

        // int fakto = 1;

        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }

        // return fakto;

        // SESUDAH PERTANYAAN

        if (n == 0 || n == 1) {

            return 1;

        } else {

            return n * faktorialBFRekursif(n - 1);
            
        }

    }

    public int faktorialBF(int n) {
        long startTime = System.nanoTime();

        int result = faktorialBFRekursif(n);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        System.out.println("Waktu eksekusi : " + durationInNano + " ms");

        return result;
    }

    public int faktorialDCRekursif(int n) {

        if (n==1) {

            return 1;

        } else {

            int fakto = n * faktorialDCRekursif(n-1);
            return fakto;

        }

    }

    public int faktorialDC(int n) {
        long startTime = System.nanoTime();

        int result = faktorialDCRekursif(n);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        System.out.println("Waktu eksekusi : " + durationInNano + " ms");

        return result;
    }
}
