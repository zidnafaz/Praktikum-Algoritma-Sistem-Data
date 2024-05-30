import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {

        Scanner input18 = new Scanner(System.in);

        DoubleLinkedLists18 dll = new DoubleLinkedLists18();
        System.out.println("========================================");
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.AddFirst(3);
        dll.AddLast(4);
        dll.AddFirst(7);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.Add(40, 1);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.Clear();
        dll.Print();
        
        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        // Percobaan 2

        dll.AddLast(50);
        dll.AddLast(40);
        dll.AddLast(10);
        dll.AddLast(20);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.RemoveFirst();
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.RemoveLast();
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.Remove(1);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        // Percobaan 3

        dll.Clear();

        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.AddFirst(3);
        dll.AddLast(4);
        dll.AddFirst(7);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");

        dll.Add(40, 1);
        dll.Print();

        System.out.println("Size    : " + dll.size);
        System.out.println("\n========================================");
        
        System.out.println("Data awal pada Linked Lists adalah : " + dll.GetFirst());
        System.out.println("Data akhir pada Linked Lists adalah : " + dll.GetLast());
        System.out.println("Data ke-1 pada Linked Lists adalah : " + dll.Get(1));
        
    }
}
