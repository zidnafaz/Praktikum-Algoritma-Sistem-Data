package program;

public class LinkedList_18 {

    Node_18 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node_18 currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(TransaksiPajak input) {
        Node_18 newNode = new Node_18(input, head);
        head = newNode;
    }

    public void addLast(TransaksiPajak input) {
        Node_18 newNode = new Node_18(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node_18 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertSorted(TransaksiPajak input) {
        if (isEmpty() || head.data.kendaraan.nama.compareTo(input.kendaraan.nama) > 0) {
            addFirst(input);
            return;
        }

        Node_18 currentNode = head;
        while (currentNode.next != null && currentNode.next.data.kendaraan.nama.compareTo(input.kendaraan.nama) < 0) {
            currentNode = currentNode.next;
        }

        Node_18 newNode = new Node_18(input, currentNode.next);
        currentNode.next = newNode;
    }

    public long calculateTotal() {
        long total = 0;
        Node_18 currentNode = head;
        while (currentNode != null) {
            total += currentNode.data.nominalBayar + currentNode.data.denda;
            currentNode = currentNode.next;
        }
        return total;
    }
    
}
