import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {

        Scanner input18 = new Scanner(System.in);

        DoubleLinkedLists_18 dll = new DoubleLinkedLists_18();
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
        
    }
}
