import processing.core.PApplet;

public class Star {
    private float x;
    private float y;
    private float radius;
    private float dx;
    private float dy;
    private float red;
    private float green;
    private float blue;
    private Project02 canvas;
    private float angle;
    private float dangle;

    //    Constructor
    public Star(float x, float y, float r, float dx, float dy, Project02 canvas) {
        if (r <= 0) {
            throw new RuntimeException("Star: negative radius");
        }
        this.canvas = canvas;
        this.x = x;
        this.y = y;
        this.radius = r;
        this.dx = dx;
        this.dy = dy;
        this.red = canvas.random(255);
        this.green = canvas.random(255);
        this.blue = canvas.random(255);
        this.dangle = canvas.random(0.05f, 0.1f);
    }

    public void draw() {
        canvas.translate(x, y);
        canvas.rotate(angle);
        canvas.stroke(red, green, blue);
        for (int i = 0; i < 4; i++) {
            canvas.rotate(canvas.PI / 4);
            canvas.line(-radius, 0, radius, 0);
        }
    }

    public void move() {
        if (x >= canvas.width) {
            x = canvas.width - 1;
            dx = -dx;
            dangle = -dangle;
        }
        if (x < 0) {
            x = 0;
            dx = -dx;
            dangle = -dangle;
        }
        if (y >= canvas.height) {
            y = canvas.height - 1;
            dy = -dy;
            dangle = -dangle;
        }
        if (y < 0) {
            y = 0;
            dy = -dy;
            dangle = -dangle;
        }
        x += dx;
        y += dy;
        angle += dangle;
    }
}
