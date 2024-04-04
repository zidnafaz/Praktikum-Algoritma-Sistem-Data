import java.util.Arrays;

public class StackPakaian_18 {

    int size;
    int top;
    Pakaian_18 data[];

    public StackPakaian_18(int size) {
        this.size = size;
        data = new Pakaian_18[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian_18 pakaian) {
        if (!isFull()) {
            top++;
            data[top] = pakaian;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian_18 x = data[top];
            top--;
            System.out
                    .println("Data yang keluar : " + x.jenis + " " + x.warna + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas   : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " "
                + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMax() {
        sortByHighestPrice();
    }
    
    public void getMin() {
        sortByLowestPrice();
    }

    private void sortByHighestPrice() {
        Pakaian_18[] sortedData = Arrays.copyOf(data, top + 1);
        
        for (int i = 0; i < sortedData.length - 1; i++) {
            for (int j = 0; j < sortedData.length - i - 1; j++) {
                if (sortedData[j].harga < sortedData[j + 1].harga) {
                    Pakaian_18 temp = sortedData[j];
                    sortedData[j] = sortedData[j + 1];
                    sortedData[j + 1] = temp;
                }
            }
        }

        if (!isEmpty()) {
            System.out.println("============================================================");
            System.out.println("     Data Pakaian dari Harga Tertinggi ke Terendah:");
            System.out.println("============================================================");
            for (Pakaian_18 pakaian : sortedData) {
                System.out.println(pakaian.jenis + " " + pakaian.warna + " " + pakaian.merk + " "
                        + pakaian.ukuran + " " + pakaian.harga);
            }
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    private void sortByLowestPrice() {
        Pakaian_18[] sortedData = Arrays.copyOf(data, top + 1);
        
        for (int i = 0; i < sortedData.length - 1; i++) {
            for (int j = 0; j < sortedData.length - i - 1; j++) {
                if (sortedData[j].harga > sortedData[j + 1].harga) {
                    Pakaian_18 temp = sortedData[j];
                    sortedData[j] = sortedData[j + 1];
                    sortedData[j + 1] = temp;
                }
            }
        }

        if (!isEmpty()) {
            System.out.println("============================================================");
            System.out.println("       Data Pakaian dari Harga Terendah ke Tertinggi:");
            System.out.println("============================================================");
            for (Pakaian_18 pakaian : sortedData) {
                System.out.println(pakaian.jenis + " " + pakaian.warna + " " + pakaian.merk + " "
                        + pakaian.ukuran + " " + pakaian.harga);
            }
        } else {
            System.out.println("Stack masih kosong");
        }

    }

}
