public class Sum_1 {
    
    public double[][] keuntungan;

    public Sum_1(int[] jumlahBulan) {
        int jumlahPerusahaan = jumlahBulan.length;
        this.keuntungan = new double[jumlahPerusahaan][];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            this.keuntungan[i] = new double[jumlahBulan[i]];
        }
    }

    public double totalBF(double[] arr) {
        double total = 0;
        for (double d : arr) {
            total += d;
        }
        return Math.round(total * 100.0) / 100.0;
    }

    public double totalDC(double[] arr, int l, int r) {
        double total = 0;
        for (double d : arr) {
            total += d;
        }
        return Math.round(total * 100.0) / 100.0;
    }

}
