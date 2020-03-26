

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class KeyInput extends KeyAdapter{

    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            gameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                //all the player events for player
                if (key == KeyEvent.VK_W) tempObject.setvelY(-5);
                if (key == KeyEvent.VK_A) tempObject.setvelX(-5);
                if (key == KeyEvent.VK_S) tempObject.setvelY(5);
                if (key == KeyEvent.VK_D) tempObject.setvelX(5);
                }

         /*   if (tempObject.getId() == ID.Player2) {
                //all the player events for player
                if (key == KeyEvent.VK_UP) tempObject.setvelY(-5);
                if (key == KeyEvent.VK_LEFT) tempObject.setvelX(-5);
                if (key == KeyEvent.VK_DOWN) tempObject.setvelY(5);
                if (key == KeyEvent.VK_RIGHT) tempObject.setvelX(5);
            } */
            }
        }
            public void keyReleased (KeyEvent e){
                int key = e.getKeyCode();
                for (int i = 0; i < handler.object.size(); i++) {
                    gameObject tempObject = handler.object.get(i);

                    if (tempObject.getId() == ID.Player) {
                        //all the player events for player
                        if (key == KeyEvent.VK_W) tempObject.setvelY(0);
                        if (key == KeyEvent.VK_A) tempObject.setvelX(0);
                        if (key == KeyEvent.VK_S) tempObject.setvelY(0);
                        if (key == KeyEvent.VK_D) tempObject.setvelX(0);
                    }

                 /*   if (tempObject.getId() == ID.Player2) {
                        //all the player events for player
                        if (key == KeyEvent.VK_UP) tempObject.setvelY(0);
                        if (key == KeyEvent.VK_LEFT) tempObject.setvelX(0);
                        if (key == KeyEvent.VK_DOWN) tempObject.setvelY(0);
                        if (key == KeyEvent.VK_RIGHT) tempObject.setvelX(0);
                    } */
                }
            }

        }
