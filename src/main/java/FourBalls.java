import processing.core.PApplet;
public class FourBalls extends PApplet{
    Frame frame=new Frame(700,500);
    Ball ball1 = new Ball(12,1,0);
    Ball ball2 = new Ball(12,2,0);
    Ball ball3 = new Ball(12,3,0);
    Ball ball4 = new Ball(12,4,0);

    public static void main(String [] args)
    {

        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(frame.getWidth(),frame.getHeight());

    }

    @Override
    public void setup() {
        makeWhiteBackground();
    }

    private void makeWhiteBackground() {
        background(235);
    }

    @Override
    public void draw() {
        ellipse(ball1.getPosition(),frame.getHeight()/5,ball1.getRadius(), ball1.getRadius());
        ellipse(ball2.getPosition(), 2*frame.getHeight()/5,ball2.getRadius(), ball2.getRadius() );
        ellipse(ball3.getPosition(),3*frame.getHeight()/5, ball3.getRadius(), ball3.getRadius());
        ellipse(ball4.getPosition(),4*frame.getHeight()/5, ball4.getRadius(), ball4.getRadius());
        ball1.setPosition((ball1.getPosition() + ball1.getSpeed()) % frame.getWidth());
        ball2.setPosition((ball2.getPosition() + ball2.getSpeed()) % frame.getWidth());
        ball3.setPosition((ball3.getPosition()+ball3.getSpeed())%frame.getWidth());
        ball4.setPosition((ball4.getPosition()+ball4.getSpeed())%frame.getWidth());


    }
}
