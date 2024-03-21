public class DaftarPenginapan_18 {

    Penginapan_18 listPenginapan[] = new Penginapan_18[5];
    int idx;

    void tambahPenginapan(Penginapan_18 Penginapan) {

        if (idx < listPenginapan.length) {

            listPenginapan[idx] = Penginapan;
            idx++;

        } else {
            
            System.out.println("Data Sudah Penuh");

        }

    }

    void tampil() {

        for (Penginapan_18 Penginapan : listPenginapan) {
            
            Penginapan.tampil();
            System.out.println("==================================================");

        }

    }

    void bubbleSortHargaDesc() {

        for (int i = 0; i < listPenginapan.length; i++) {
            for (int j = 1; j < listPenginapan.length; j++) {
                if (listPenginapan[j].harga > listPenginapan[j-1].harga) {

                    // Proses Swap atau Penukaran

                    Penginapan_18 mahal = listPenginapan[j];
                    listPenginapan[j] = listPenginapan[j-1];
                    listPenginapan[j-1] = mahal;
                     
                }                
            }
        }

    }

    void bubbleSortHargaAsc() {

        for (int i = 0; i < listPenginapan.length; i++) {
            for (int j = 1; j < listPenginapan.length; j++) {
                if (listPenginapan[j].harga < listPenginapan[j-1].harga) {

                    // Proses Swap atau Penukaran

                    Penginapan_18 mahal = listPenginapan[j];
                    listPenginapan[j] = listPenginapan[j-1];
                    listPenginapan[j-1] = mahal;
                     
                }                
            }
        }

    }

    void selectionSortRatingAsc() {

        for (int i = 0; i < listPenginapan.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < listPenginapan.length; j++) {
                if (listPenginapan[j].rating < listPenginapan[idxMin].rating) {
                    idxMin = j;
                }
            }

            // Swap

            Penginapan_18 terendah = listPenginapan[idxMin];
            listPenginapan[idxMin] = listPenginapan[i];
            listPenginapan[i] = terendah;
        }

    }

    void selectionSortRatingDesc() {

        for (int i = 0; i < listPenginapan.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < listPenginapan.length; j++) {
                if (listPenginapan[j].rating > listPenginapan[idxMin].rating) {
                    idxMin = j;
                }
            }

            // Swap

            Penginapan_18 tertinggi = listPenginapan[idxMin];
            listPenginapan[idxMin] = listPenginapan[i];
            listPenginapan[i] = tertinggi;
        }

    }

}
