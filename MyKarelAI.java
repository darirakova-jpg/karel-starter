import stanford.karel.*;

public class MyKarelAI extends Karel {

    public void run() {
        move();
        turnRight();
        move();
        move();
        pickBeeper();

        turnLeft();
        move();
        pickBeeper();

        turnLeft();
        move();
        turnRight();
        move();
        pickBeeper();

        turnAround();
    }

    private void turnAround() {
        turnLeft();
        turnLeft();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}