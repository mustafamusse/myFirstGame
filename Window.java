import javax.swing.*;
import java.awt.Canvas;
import java.awt.Dimension;


public class Window extends Canvas {

    private static final long serialVersionUID = -240840600533728354L;

    public Window (int width, int length, String title, Game game) {
        JFrame frame = new JFrame(title);

        frame.setMinimumSize(new Dimension(width, length));
        frame.setMaximumSize(new Dimension(width, length));
        frame.setPreferredSize(new Dimension(width, length));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit button
        frame.setResizable(false); //
        frame.setLocationRelativeTo(null); //startar i mitten av skärmen
        frame.add(game); //
        frame.setVisible(true); //så vi kan se spelet
        game.start();

    }
}
