import java.awt.*;

    public class Player extends gameObject {

        Handler handler;

        public Player(int x, int y, ID id, Handler handler) {
            super(x, y, id);
            //vX = 1;
            this.handler = handler;
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, 32, 32);
        }

        public void tick() {
            x += vX;
            y += vY;

            x = Game.clamp(x, 0, Game.WIDTH - 30);
            y = Game.clamp(y, 0, Game.HEIGHT - 55);

            Collision();

        }

        public void Collision() {

            for (int i = 0; i < handler.object.size(); i++) {
                gameObject tempObject = handler.object.get(i);

                if (tempObject.getId() == ID.BasicEnemy) {
                    if (getBounds().intersects(tempObject.getBounds())) {
                        HUD.Health -= 2;
                    }
                }
            }
        }

        public void render(Graphics g) {

            if (id == ID.Player) g.setColor(Color.white);
            // if (id == ID.Player2) g.setColor(Color.cyan);
            g.fillRect(x, y, 32, 32);
        }
    }
