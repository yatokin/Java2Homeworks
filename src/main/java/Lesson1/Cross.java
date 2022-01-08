package Lesson1;

public class Cross extends Obstacle{
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Animal competitor) {
        competitor.run(length);
    }
}
