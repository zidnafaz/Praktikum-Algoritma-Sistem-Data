package ProgramNonCollection;

public class LinkedListTransaksi_18 {
    NodeTransaksi_18 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeTransaksi_18 currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.transaksi);
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Transaksi_18 transaksi) {
        NodeTransaksi_18 newNode = new NodeTransaksi_18(transaksi, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Transaksi_18 transaksi) {
        NodeTransaksi_18 newNode = new NodeTransaksi_18(transaksi, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeTransaksi_18 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            NodeTransaksi_18 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head.transaksi.idTransaksi == key) {
            removeFirst();
        } else {
            NodeTransaksi_18 currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.transaksi.idTransaksi == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public Transaksi_18 findById(int id) {
        NodeTransaksi_18 currentNode = head;
        while (currentNode != null) {
            if (currentNode.transaksi.idTransaksi == id) {
                return currentNode.transaksi;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void sortByName() {
        if (!isEmpty() && head.next != null) {
            NodeTransaksi_18 sortedHead = null;
            NodeTransaksi_18 currentNode = head;
            while (currentNode != null) {
                NodeTransaksi_18 nextNode = currentNode.next;
                sortedHead = sortedInsert(sortedHead, currentNode);
                currentNode = nextNode;
            }
            head = sortedHead;
        }
    }

    private NodeTransaksi_18 sortedInsert(NodeTransaksi_18 sortedHead, NodeTransaksi_18 newNode) {
        if (sortedHead == null || sortedHead.transaksi.pelanggan.namaPelanggan.compareTo(newNode.transaksi.pelanggan.namaPelanggan) >= 0) {
            newNode.next = sortedHead;
            return newNode;
        } else {
            NodeTransaksi_18 current = sortedHead;
            while (current.next != null && current.next.transaksi.pelanggan.namaPelanggan.compareTo(newNode.transaksi.pelanggan.namaPelanggan) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return sortedHead;
        }
    }
}