import java.net.Socket;

public class Dragon07 {

    int x, y, width, height;

    void moveLeft() {
        if (y >= 0 && y < height) {
            y = y - 1;
        } else {
            detectCollision();
        }
    }
    
    void moveRight() {
        if (x >= 0 && x < width) {
            x = x + 1;
        } else {
            detectCollision();
        }

    }

    void moveUp() {
        if (y >= 0 && y < height) {
            y = y - 1;
        } else {
            detectCollision();
        }

    }

    void moveDown() {
        if (x >= 0 && x < width) {
            x = x - 1;
        } else {
            detectCollision();
        }

    }

    void printPosition() {
        System.out.println("Dragon sedang berada di titik koordinat : (" + x + "," + y + ")");

    }

    void detectCollision() {
        System.out.println("GAME OVER!!!!!");
        System.exit(0);
    }
}
