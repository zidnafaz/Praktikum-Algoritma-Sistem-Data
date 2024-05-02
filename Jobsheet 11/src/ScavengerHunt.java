import java.util.Scanner;

public class ScavengerHunt {
    ScavengerHuntNode head;

    public ScavengerHunt() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        
        ScavengerHuntNode newNode = new ScavengerHuntNode(question, answer);

        if (head == null) {
            head = newNode;
        } else {
            ScavengerHuntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void startHunt() {

        Scanner scanner = new Scanner(System.in);
        ScavengerHuntNode current = head;

        while (current != null) {

            System.out.println("Pertanyaan  : " + current.question);
            System.out.print("Jawaban     : ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("BENARR! Lanjut ke pertanyaan selanjutnya.");
                current = current.next;
            } else {
                System.out.println("Yahhh Jawaban Salah! Coba lagi yahh.");
            }

            System.out.println();

        }

        System.out.println("SELAMATTT! Kamu Berhasil Menemukan Harta Karun!");
        scanner.close();
        
    }
}
