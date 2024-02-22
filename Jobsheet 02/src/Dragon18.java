public class Dragon18 {
    int x, y, width, height;

    public Dragon18(int xx, int yy, int wwidth, int hheight) {
        x = xx;
        y = yy;
        width = wwidth;
        height = hheight;
    }

    void detectCollision() {
        System.out.println("Game Over");
    }

    void moveLeft() {
        x--;

        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;

        if (x < 0 || x > width) {
            detectCollision();
        }
    }
    
    void moveUp() {
        y--;

        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void moveDown() {
        y++;

        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
