public class HitungJarak {

    public String alamatPenerima;
    public String alamatPengirim;
    public int jarak = 0;

    public HitungJarak(String alamatPenerima, String alamatPengirim) {

        this.alamatPenerima = alamatPenerima;
        this.alamatPengirim = alamatPengirim;

    }

    public void hitungJarak() {
        jarak = Jarak(alamatPenerima, alamatPengirim);
    }

    public int Jarak(String alamatPenerima, String alamatPengirim) {

        if ((alamatPengirim.equalsIgnoreCase("Malang") && alamatPenerima.equalsIgnoreCase("Jakarta")) ||
                (alamatPengirim.equalsIgnoreCase("Jakarta") && alamatPenerima.equalsIgnoreCase("Malang"))) {
            return 850;
        } else if ((alamatPengirim.equalsIgnoreCase("Malang") && alamatPenerima.equalsIgnoreCase("Bandung")) ||
                (alamatPengirim.equalsIgnoreCase("Bandung") && alamatPenerima.equalsIgnoreCase("Malang"))) {
            return 700;
        } else if ((alamatPengirim.equalsIgnoreCase("Malang") && alamatPenerima.equalsIgnoreCase("Surabaya")) ||
                (alamatPengirim.equalsIgnoreCase("Surabaya") && alamatPenerima.equalsIgnoreCase("Malang"))) {
            return 40;
        } else if ((alamatPengirim.equalsIgnoreCase("Malang") && alamatPenerima.equalsIgnoreCase("Semarang")) ||
                (alamatPengirim.equalsIgnoreCase("Semarang") && alamatPenerima.equalsIgnoreCase("Malang"))) {
            return 400;
        } else if ((alamatPengirim.equalsIgnoreCase("Malang") && alamatPenerima.equalsIgnoreCase("Serang")) ||
                (alamatPengirim.equalsIgnoreCase("Serang") && alamatPenerima.equalsIgnoreCase("Malang"))) {
            return 900;
        } else if ((alamatPengirim.equalsIgnoreCase("Surabaya") && alamatPenerima.equalsIgnoreCase("Solo")) ||
                (alamatPengirim.equalsIgnoreCase("Solo") && alamatPenerima.equalsIgnoreCase("Surabaya"))) {
            return 250;
        } else {
            System.out.println("Pengiriman tidak tersedia. Masukkan alamat dengan benar.\n");
            return 0;
        }
    }

    public void tampilkanJarak() {
        System.out.println("Dari     : " + alamatPengirim);
        System.out.println("Ke       : " + alamatPenerima);
        System.out.println("Jarak    : " + jarak);
    }
}
