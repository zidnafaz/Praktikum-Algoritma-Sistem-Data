public class QueuePasien_18 {

    Pasien_18[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public QueuePasien_18(int n) {
        max = n;
        antrian = new Pasien_18[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("========================================");
            System.out.println("            ANTRIAN TERDEPAN");
            System.out.println("========================================");
            System.out.println("Nama           : " + antrian[front].nama);
            System.out.println("Nomor ID       : " + antrian[front].noID);
            System.out.println("Jenis Kelamin  : " + antrian[front].jenisKelamin);
            System.out.println("Umur           : " + antrian[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("========================================");
            System.out.println("            ANTRIAN TERDEPAN");
            System.out.println("========================================");
            System.out.println("Nama           : " + antrian[rear].nama);
            System.out.println("Nomor ID       : " + antrian[rear].noID);
            System.out.println("Jenis Kelamin  : " + antrian[rear].jenisKelamin);
            System.out.println("Umur           : " + antrian[rear].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        boolean found = false;
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i] != null && antrian[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("========================================");
                    System.out.println("          DATA PASIEN DITEMUKAN");
                    System.out.println("========================================");
                    System.out.println("Nama           : " + antrian[i].nama);
                    System.out.println("Nomor ID       : " + antrian[i].noID);
                    System.out.println("Jenis Kelamin  : " + antrian[i].jenisKelamin);
                    System.out.println("Umur           : " + antrian[i].umur);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Data pasien dengan nama " + nama + " tidak ditemukan.");
        }
    }
    
    

    public void daftarPasien() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("========================================");
            System.out.println("           DATA SEMUA ANTRIAN");
            System.out.println("========================================");
            int i = front;
            do {
                System.out.println("Nama           : " + antrian[i].nama);
                System.out.println("Nomor ID       : " + antrian[i].noID);
                System.out.println("Jenis Kelamin  : " + antrian[i].jenisKelamin);
                System.out.println("Umur           : " + antrian[i].umur);
                System.out.println("========================================");
                i = (i + 1) % max;
            } while (i != (rear + 1) % max);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pasien_18 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pasien_18 Dequeue() {
        Pasien_18 dt = new Pasien_18();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}
