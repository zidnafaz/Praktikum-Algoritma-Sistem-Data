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
        
        Node_18 newNode = new Node_18(key, null);

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
    
}
