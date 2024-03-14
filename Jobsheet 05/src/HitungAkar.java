public class HitungAkar {
    
    public static double BruteForce(double bilangan) {
        double epsilon = 0.00001;
        double akar = 0;

        while (akar * akar <= bilangan) {
            akar += epsilon;
        }

        return Math.floor(akar * 100.0) / 100.0;
    }
    
    public static double DivideConquer(double bilangan) {
        if (bilangan == 0 || bilangan == 1) {
            return bilangan;
        }
        
        double hasil = binarySearch(0, bilangan, bilangan);
        return Math.floor(hasil * 100.0) / 100.0;
    }

    private static double binarySearch(double kiri, double kanan, double bilangan) {
        double epsilon = 0.00001;
        double tengah = (kiri + kanan) / 2;

        if (Math.abs(tengah * tengah - bilangan) <= epsilon) {
            return tengah;
        }

        if (tengah * tengah < bilangan) {
            return binarySearch(tengah, kanan, bilangan);
        } else {
            return binarySearch(kiri, tengah, bilangan);
        }
    }
}
