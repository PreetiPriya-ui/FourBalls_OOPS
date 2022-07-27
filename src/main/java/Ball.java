public class Ball {
    private int radius;
    private int speed;
    private int position;

    public Ball(int radius, int speed, int position ){
        this.radius = radius;
        this.position=position;
        this.speed=speed;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
