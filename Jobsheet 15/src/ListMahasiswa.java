import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {

    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // int linearSearch(String nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals(mahasiswas.get(i).nim)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    int binarySearch(String nim) {
        
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
        
        int low = 0;
        int high = mahasiswas.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midNim = mahasiswas.get(mid).nim;
            int cmp = midNim.compareTo(nim);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public void ascendingSort() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void descendingSort() {
        Collections.sort(mahasiswas, Comparator.comparing((Mahasiswa m) -> m.nim).reversed());
    }

    public static void main(String[] args) {
            
        ListMahasiswa lm = new ListMahasiswa();
    
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
    
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
    
        System.out.println("");
        lm.tampil();

        System.out.println("Ascending Sort:");
        lm.ascendingSort();
        lm.tampil();

        System.out.println("\nDescending Sort:");
        lm.descendingSort();
        lm.tampil();
    
    }
    
}
