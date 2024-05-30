public class DoubleLinkedLists18 {

    Node18 head;
    int size;

    public DoubleLinkedLists18() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void AddFirst(int item) {
        
        if (IsEmpty()) {

            head = new Node18(null, item, null);

        } else {

            Node18 newNode = new Node18(null, item, head);
            head.prev = newNode;
            head = newNode;

        }

        size++;

    }
    

    public void AddLast(int item) {

        if (IsEmpty()) {
            AddFirst(item);
        } else {
            Node18 cureent = head;
            while (cureent.next != null) {
                cureent = cureent.next;
            }
            Node18 newNode = new Node18(cureent, item, null);
            cureent.next = newNode;
            size++;
        }

    }

    public void Add(int item, int index) throws Exception {

        if (IsEmpty()) {

            AddFirst(item);

        } else if (index < 0 || index > size) {

            throw new Exception("Nilai index diluar batas");
            
        } else {

            Node18 current = head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                
                Node18 newNode = new Node18(null, item, current);
                current.prev = newNode;
                head = newNode;

            } else {

                Node18 newNode = new Node18(current.prev, item, current);
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
            
            Node18 tmp = head;

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

    // Percobaan 2

    public void RemoveFirst() throws Exception {

        if (IsEmpty()) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            RemoveLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }

    }

    public void RemoveLast() throws Exception {

        if (IsEmpty()) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node18 current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        size--;

    }

    public void Remove(int index) throws Exception {

        if (IsEmpty() || index >= size) {
            throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
        } else if (index == 0) {
            RemoveFirst();
        } else {

            Node18 current = head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            size--;

        }

    }

    // Percobaan 3

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

        Node18 tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        
        return tmp.data;

    }

    public int Get(int index) throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked masih kosong");
        }

        Node18 tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        
        return tmp.data;

    }

}
