public class Sum {
    
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {

        for (int i = 0; i < elemen; i++) {

            total = total + arr[i];

        }

        return Math.round(total * 100.0) / 100.0;
    }

    double totalDC(double arr[], int l, int r) {

        if (l == r) {
            
            return arr[l];

        } else if (l < r) {
            
            int mid = (l + r) / 2;
            
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);

            return Math.round((lsum + rsum + arr[mid]) * 100.0) / 100.0;

        }

        return 0;

    }

}
