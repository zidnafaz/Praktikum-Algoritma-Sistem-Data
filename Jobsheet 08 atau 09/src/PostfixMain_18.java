import java.util.Scanner;

public class PostfixMain_18 {

    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        String P = ""; 
        String Q;
        
        System.out.print("Masukkan ekspresi matematika (infix) : ");
        Q = input18.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix_18 post = new Postfix_18(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }

}
