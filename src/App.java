import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.File;

import javax.swing.*;

public class App {

    static Font pixelFont;
    public static void main(String[] args) throws Exception {

        int boardWidth = 600;
        int boardHeight = boardWidth;

        try {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File("PressStart2P-vaV7.ttf")).deriveFont(50f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PressStart2P-vaV7.ttf")));
        }
        catch(IOException | FontFormatException e ) {}

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardHeight, boardWidth);
        frame.setLocationRelativeTo(null); // Opens window at center of screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardHeight, boardWidth);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }
}
