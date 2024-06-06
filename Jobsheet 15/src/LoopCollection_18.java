import java.util.*;

public class LoopCollection_18 {

    public static void main(String[] args) {

        Stack<String> fruits = new Stack<>();
        
        // Pertanyaan Percobaan 2

        // List<String> fruits = new Stack<>();

        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");
        fruits.pop();
        fruits.add("Strawberry");

        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // fruits.push("Melon");
        // fruits.push("Durian");

        System.out.println("");

        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("");

        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });

        System.out.println("");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        
    }
    
}