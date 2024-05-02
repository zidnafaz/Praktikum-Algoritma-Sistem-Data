public class SLLMain_18 {

    public static void main(String[] args) {

        LinkedList_18 myLinkedList_18 = new LinkedList_18();

        myLinkedList_18.Print();
        myLinkedList_18.AddFirst(800);
        myLinkedList_18.Print();
        myLinkedList_18.AddFirst(700);
        myLinkedList_18.Print();
        myLinkedList_18.AddLast(500);
        myLinkedList_18.Print();
        myLinkedList_18.InsertAfter(700, 300);
        myLinkedList_18.Print();

        // Percobaan 2

        System.out.println("Data pada index ke-1             : " + myLinkedList_18.GetData(1));
        System.out.println("Data 300 berada pada index ke    : " + myLinkedList_18.IndexOf(300));

        myLinkedList_18.Remove(300);
        myLinkedList_18.Print();
        myLinkedList_18.RemoveFirst();
        myLinkedList_18.Print();
        myLinkedList_18.RemoveLast();
        myLinkedList_18.Print();

        // Pertanyaan Percobaan 1 Nomor 4

        System.out.println("Pertanyaan Percobaan 1 Nomor 4");

        myLinkedList_18.InsertAt(1,100);
        myLinkedList_18.Print();

    }

}