public class DoubleLinkedLists_18 {

    Node_18 head;
    int size;

    public DoubleLinkedLists_18() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void AddFirst(int item, int jarak) {
        if (IsEmpty()) {
            head = new Node_18(null, item, head, jarak);
        } else {
            Node_18 newNode = new Node_18(null, item, head, jarak);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void AddLast(int item, int jarak) {
        if (IsEmpty()) {
            AddFirst(item, jarak);
        } else {
            Node_18 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node_18 newNode = new Node_18(current, item, null, jarak);
            current.next = newNode;
            size++;
        }
    }

    public void Add(int item, int jarak, int index) throws Exception {
        if (IsEmpty()) {
            AddFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Node_18 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node_18 newNode = new Node_18(null, item, current, jarak);
                current.prev = newNode;
                head = newNode;
            } else {
                Node_18 newNode = new Node_18(current.prev, item, current, jarak);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int Size() {
        return size;
    }

    public void Clear() {
        head = null;
        size = 0;
    }

    public void Print() {
        if (!IsEmpty()) {
            Node_18 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n========================================");
            System.out.println("Berhasil diisi");
        } else {
            System.out.println("Linked lists kosong");
        }
    }

    public void RemoveFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void RemoveLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
        } else {
            Node_18 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void Remove(int target) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else {
            Node_18 current = head;
            while (current != null) {
                if (current.data == target) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    size--;
                    return;
                }
                current = current.next;
            }
            throw new Exception("Node dengan data " + target + " tidak ditemukan");
        }
    }

    public int GetFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked masih kosong");
        }
        return head.data;
    }

    public int GetLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked masih kosong");
        }
        Node_18 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int Get(int index) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked masih kosong");
        }
        Node_18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int GetJarak(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node_18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void UpdateJarak(int data, int jarakBaru) {
        Node_18 current = head;
        while (current != null) {
            if (current.data == data) {
                current.jarak = jarakBaru;
                return;
            }
            current = current.next;
        }
        System.out.println("Tidak ada node dengan data " + data);
    }

}
