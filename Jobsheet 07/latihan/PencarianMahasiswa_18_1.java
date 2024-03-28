import java.util.Arrays;

public class PencarianMahasiswa_18_1 {

    Mahasiswa_18 listMahasiswa[];
    int index;

    public PencarianMahasiswa_18_1(int jumlahMahasiswa) {
        listMahasiswa = new Mahasiswa_18[jumlahMahasiswa];
        index = 0;
    }

    void Tambah(Mahasiswa_18 m) {
        if (index < listMahasiswa.length) {
            listMahasiswa[index] = m;
            index++;
        } else {
            System.out.println("Data sudah penuh !!!");
        }
    }

    void Tampil() {
        for (Mahasiswa_18 m : listMahasiswa) {
            m.Tampil();
            System.out.println("============================================================");
        }
    }

    // Metode untuk melakukan pencarian nama mahasiswa menggunakan binary search
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int result = cari.compareTo(listMahasiswa[mid].nama);
            if (result == 0) {
                // Jika nama ditemukan, lanjutkan pencarian ke kiri dan kanan untuk mencari hasil tambahan
                int count = 1;
                int leftIndex = mid - 1;
                int rightIndex = mid + 1;

                // Cari ke kiri
                while (leftIndex >= 0 && listMahasiswa[leftIndex].nama.equals(cari)) {
                    count++;
                    leftIndex--;
                }

                // Cari ke kanan
                while (rightIndex < listMahasiswa.length && listMahasiswa[rightIndex].nama.equals(cari)) {
                    count++;
                    rightIndex++;
                }

                System.out.println("Ditemukan " + count + " hasil dengan nama yang sama.");
                return mid; // Kembalikan indeks pertama yang ditemukan
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Jika tidak ditemukan
    }

    public void TampilPosisi(int pos) {
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void TampilData(int pos) {
        if (pos != -1) {
            listMahasiswa[pos].Tampil();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
