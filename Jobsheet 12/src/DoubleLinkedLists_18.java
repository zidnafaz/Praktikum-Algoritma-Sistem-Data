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

    public void AddFirst(int item) {
        
        if (IsEmpty()) {

            head = new Node_18(null, item, null);

        } else {

            Node_18 newNode = new Node_18(null, item, head);
            head.prev = newNode;
            head = newNode;

        }

        size++;

    }
    

    public void AddLast(int item) {

        if (IsEmpty()) {
            AddFirst(item);
        } else {
            Node_18 cureent = head;
            while (cureent.next != null) {
                cureent = cureent.next;
            }
            Node_18 newNode = new Node_18(cureent, item, null);
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

            Node_18 current = head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                
                Node_18 newNode = new Node_18(null, item, current);
                current.prev = newNode;
                head = newNode;

            } else {

                Node_18 newNode = new Node_18(current.prev, item, current);
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
                
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;

            }

            System.out.println("========================================");
            System.out.println("Berhasil diisi");

        } else {

            System.out.println("Linked lists kosong");
            
        }
    }

}
