import java.awt.*;

public class Rect extends Figure {
    private int w;
    private int h;

    public Rect(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, w, h);
    }

    @Override
    public boolean contains(int xClick, int yClick) {
        return x <= xClick && x + w >= xClick && y <= yClick && y + h >= yClick;
    }
}
