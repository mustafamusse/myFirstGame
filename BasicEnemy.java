import java.awt.*;

public class BasicEnemy extends gameObject{

    private Handler handler;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x,y,id);
        this.handler = handler;
        //vX = 5;
        vY = 5;
        vX = -5;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }

    public void tick() {
        x += vX;
        y += vY;

        if(y <= 0 || y>= Game.HEIGHT - 35) vY *= -1;
        if(x <= 0 || x>= Game.WIDTH - 35) vX *=-1;

        handler.addObject(new Trail(x, y, ID.trail, Color.red, 16, 16, 0.1f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y,16, 16);
    }
}
