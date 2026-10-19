import stanford.karel.*;

public class MyKarelAI extends Karel {

    public void run() {
        move();
        turnRight();
        move();
        move();
        pickBeeper();

        turnLeft();
        moveAndPickBeeper();

        turnLeft();
        move();
        turnRight();
        moveAndPickBeeper();
    }

    private void moveAndPickBeeper() {
        move();
        pickBeeper();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}