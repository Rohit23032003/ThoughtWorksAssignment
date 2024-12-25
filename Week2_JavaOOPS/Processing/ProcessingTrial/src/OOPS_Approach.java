
import processing.core.PApplet;

public class OOPS_Approach extends PApplet {

    public static final int HEIGHT = 500;
    public static final int WIDTH = 1000;
    public static final int DIAMETER = 12;

    // Array to store the Circle objects
    private Circle[] circles;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        // Initialize the circles with their specific properties
        circles = new Circle[]{
                new Circle(1, HEIGHT / 5f, 1),
                new Circle(2, (HEIGHT / 5f) * 2, 2),
                new Circle(3, (HEIGHT / 5f) * 3, 3),
                new Circle(4, (HEIGHT / 5f) * 4, 4)
        };
    }

    @Override
    public void draw() {
        for (Circle circle : circles) {
            circle.move();
            circle.display(this);
        }
    }

    class Circle {
        private float x;
        private float y;
        private float speed;

        public Circle(float initialX, float initialY, float speed) {
            this.x = initialX;
            this.y = initialY;
            this.speed = speed;
        }

        public void move() {
            x += speed;
        }

        public void display(PApplet applet) {
            applet.ellipse(x, y, DIAMETER, DIAMETER);
        }
    }
}
