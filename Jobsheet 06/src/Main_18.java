public class Main_18 {
    public static void main(String[] args) {

        DaftarMahasiswaBerprestasi_18 list = new DaftarMahasiswaBerprestasi_18();

        Mahasiswa_18 m1 = new Mahasiswa_18("Nusa", 2017, 25, 3);
        Mahasiswa_18 m2 = new Mahasiswa_18("Rara", 2012, 19, 4);
        Mahasiswa_18 m3 = new Mahasiswa_18("Dompu", 2018, 19, 3.5);
        Mahasiswa_18 m4 = new Mahasiswa_18("Abdul", 2017, 23, 2);
        Mahasiswa_18 m5 = new Mahasiswa_18("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("========================================");
        System.out.println("Data Mahasiswa Sebelum Sorting");
        System.out.println("========================================");
        list.tampil();
        
        // System.out.println("Data Mahasiswa Setelah Sorting Desc Berdasarkan IPK");
        // System.out.println("========================================");
        // list.bubbleSort();
        // list.tampil();
        
        // System.out.println("Data Mahasiswa Setelah Sorting Asc Berdasarkan IPK");
        // System.out.println("========================================");
        // list.selectionSort();
        // list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Sorting Asc Berdasarkan IPK");
        System.out.println("========================================");
        list.insertionSort();
        list.tampil();
    }
}
