public class QueueNasabah_18 {

    Nasabah_18[] data;
    int front;
    int rear;
    int size;
    int max;

    public QueueNasabah_18(int n) {
        max = n;
        data = new Nasabah_18[max];
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
            System.out.println("            ELEMEN TERDEPAN");
            System.out.println("========================================");
            System.out.println("Nomor Rekening : " + data[front].norek);
            System.out.println("Nama           : " + data[front].nama);
            System.out.println("Alamat         : " + data[front].alamat);
            System.out.println("Umur           : " + data[front].umur);
            System.out.println("Saldo          : " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("========================================");
            System.out.println("           DATA SEMUA ANTRIAN");
            System.out.println("========================================");
            int i = front;
            while (i != rear) {
                System.out.println("Nomor Rekening : " + data[front].norek);
                System.out.println("Nama           : " + data[front].nama);
                System.out.println("Alamat         : " + data[front].alamat);
                System.out.println("Umur           : " + data[front].umur);
                System.out.println("Saldo          : " + data[front].saldo);
                System.out.println("========================================");
                i = (i + 1) % max;
            }
            System.out.println("Nomor Rekening : " + data[i].norek);
            System.out.println("Nama           : " + data[i].nama);
            System.out.println("Alamat         : " + data[i].alamat);
            System.out.println("Umur           : " + data[i].umur);
            System.out.println("Saldo          : " + data[i].saldo);
            System.out.println("========================================");
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

    public void Enqueue(Nasabah_18 dt) {
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
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah_18 Dequeue() {
        Nasabah_18 dt = new Nasabah_18();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
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
