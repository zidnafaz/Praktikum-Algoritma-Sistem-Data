public class LinkedList_18 {

    Node_18 head;

    public boolean IsEmpty() {
        return (head == null);
    }

    public void Print() {
        if (!IsEmpty()) {

            System.out.print("Isi Linked List     : ");
            Node_18 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");

        } else {

            System.out.println("Linked List Kosong");
            
        }
    }

    public void AddFirst(int input) {

        Node_18 newNode = new Node_18(input, null);

        if (IsEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void AddLast(int input) {

        Node_18 newNode = new Node_18(input, null);

        if (IsEmpty()) {
            head = newNode;
        } else {

            Node_18 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            
        }

    }

    public void InsertAfter(int key, int input) {
        
        Node_18 newNode = new Node_18(input, null);

        if (!IsEmpty()) {
            
            Node_18 currentNode = head;

            do {

                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                
                currentNode = currentNode.next;

            } while (currentNode != null);

        } else {

            System.out.println("Linked List Kosong");
            
        }

    }

    // Percobaan 2

    public int GetData(int index) {

        Node_18 currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;

    }

    public int IndexOf(int key) {

        Node_18 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }

    }

    public void RemoveFirst() {

        if (!IsEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked List Kosong");
        }

    }

    public void RemoveLast() {

        if (IsEmpty()) {
            System.out.println("Linked List Kosong");
        } else if (head.next == null) {
            head = null;
        } else {

            Node_18 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next= null;
                    break;
                }
                
                currentNode = currentNode.next;

            }
        }

    }

    public void Remove(int key) {

        if (IsEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head.data == key) {
            RemoveFirst();
        } else {

            Node_18 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;

            }

        }

    }
    
}
