public class DragonMain18 {

    public static void main(String[] args) {

        Dragon18 dragon1 = new Dragon18(23, 23, 30, 30);

        dragon1.moveUp();
        dragon1.moveDown();
        dragon1.moveRight();
        dragon1.moveLeft();

        System.out.println("Posisi X : " + dragon1.getX());
        System.out.println("Posisi Y : " + dragon1.getY());
    }
}
