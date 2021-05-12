import java.awt.*;

public class Circle extends Figure {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }


    @Override
    public boolean contains(int xClick, int yClick) {
        int dx = xClick - x;
        int dy = yClick - y;
        return r * r >= dx * dx + dy * dy;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
    }
}
