public class DragonMain07 {

    public static void main(String[] args) {

        Dragon07 pemain = new Dragon07();
        pemain.x = 0;
        pemain.y = 0;
        pemain.width = 5;
        pemain.height = 5;

        pemain.moveRight();
        pemain.printPosition();
        pemain.moveUp();
        pemain.printPosition();
        
    }
    
}
