public class StackStruk {

    Struk top;

    public StackStruk() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(StrukBelanja data) {
        Struk newStruk = new Struk(data);
        if (top == null) {
            top = newStruk;
        } else {
            newStruk.next = top;
            top = newStruk;
        }
    }

    public StrukBelanja pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else {
            StrukBelanja temp = top.data;
            top = top.next;
            return temp;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }

        Struk current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}