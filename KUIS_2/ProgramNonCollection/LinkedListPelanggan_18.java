package ProgramNonCollection;

public class LinkedListPelanggan_18 {
    NodePelanggan_18 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodePelanggan_18 currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.pelanggan);
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Pelanggan_18 pelanggan) {
        NodePelanggan_18 newNode = new NodePelanggan_18(pelanggan, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Pelanggan_18 pelanggan) {
        NodePelanggan_18 newNode = new NodePelanggan_18(pelanggan, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodePelanggan_18 currentNode = head;
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
            NodePelanggan_18 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head.pelanggan.idPelanggan == key) {
            removeFirst();
        } else {
            NodePelanggan_18 currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.pelanggan.idPelanggan == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public Pelanggan_18 findById(int id) {
        NodePelanggan_18 currentNode = head;
        while (currentNode != null) {
            if (currentNode.pelanggan.idPelanggan == id) {
                return currentNode.pelanggan;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void sortByName() {
        if (!isEmpty() && head.next != null) {
            NodePelanggan_18 sortedHead = null;
            NodePelanggan_18 currentNode = head;
            while (currentNode != null) {
                NodePelanggan_18 nextNode = currentNode.next;
                sortedHead = sortedInsert(sortedHead, currentNode);
                currentNode = nextNode;
            }
            head = sortedHead;
        }
    }

    private NodePelanggan_18 sortedInsert(NodePelanggan_18 sortedHead, NodePelanggan_18 newNode) {
        if (sortedHead == null || sortedHead.pelanggan.namaPelanggan.compareTo(newNode.pelanggan.namaPelanggan) >= 0) {
            newNode.next = sortedHead;
            return newNode;
        } else {
            NodePelanggan_18 current = sortedHead;
            while (current.next != null && current.next.pelanggan.namaPelanggan.compareTo(newNode.pelanggan.namaPelanggan) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return sortedHead;
        }
    }
}