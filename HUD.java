import java.awt.*;

public class HUD {

    public static int Health = 100;
    private int green = 255;

    public void tick(){
        Health = Game.clamp(Health, 0, 100);
        green = Game.clamp(green, 0, 255);

        green = Health*2;
    }

    public void render(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(15, 15, 200, 32);
        g.setColor(new Color(75, green, 0));
        g.fillRect(15, 15, Health * 2, 32);
        g.setColor(Color.WHITE);
        g.drawRect(15, 15, 200, 32);

    }
}
