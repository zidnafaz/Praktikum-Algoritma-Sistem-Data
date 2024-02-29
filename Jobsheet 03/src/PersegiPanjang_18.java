public class PersegiPanjang_18 {

    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;

    public PersegiPanjang_18(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void cetakInfo() {
        System.out.println("\nPanjang     : " + panjang);
        System.out.println("Lebar       : " + lebar);
        System.out.println("Luas        : " + luas);
        System.out.println("Keliling    : " + keliling);
    }

    public int hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public int hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
    
    //     public PersegiPanjang() {
    //         panjang = 0;
    //         lebar = 0;
    //     }
    
    //     public PersegiPanjang(int sisi) {
    //         panjang = sisi;
    //         lebar = sisi;
    //     }
    
    //     public PersegiPanjang(int panjang, int lebar) {
    //         this.panjang = panjang;
    //         this.lebar = lebar;
    //     }
    
    // }
    
}