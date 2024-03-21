public class DaftarMahasiswaBerprestasi_18 {

    Mahasiswa_18 listMhs[] = new Mahasiswa_18[5];
    int idx;

    // Method Tambah

    void tambah(Mahasiswa_18 m) {

        if (idx < listMhs.length) {
            
            listMhs[idx] = m;
            idx++;

        } else {

            System.out.println("Data sudah penuh!!!");
            
        }

    }

    void tampil() {

        for (Mahasiswa_18 m : listMhs) {
            m.tampil();
            System.out.println("========================================");
        }

    }

    void bubbleSort() {

        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {

                    // Proses Swap atau Penukaran
                    Mahasiswa_18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                     
                }                
            }
        }

    }

    void selectionSort() {

        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }

            // Swap

            Mahasiswa_18 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }

    }

    void insertionSort() {
        
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa_18 temp = listMhs[i];
            int j = i;

            // while (j > 0 && listMhs[j - 1].ipk > temp.ipk) { // Ascending
            //     listMhs[j] = listMhs[j - 1];
            //     j--;
            // }

            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { // Descending
                listMhs[j] = listMhs[j - 1];
                j--;
            }

            listMhs[j] = temp;
            
        }

    }
}
