package com.yahoo.cedricbstpierre;



import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    static final int WIN_WIDTH = 700;
    static final int WIN_HEIGHT = 700;
    Game game;
    public GameWindow() {
        WindowParameters();
        setLayout(new FlowLayout());
        game = new Game();
        addKeyListener(game);
        add(game);
        validate();
    }

    void WindowParameters() {
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setTitle("Defender");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getSize().width) / 2, (screenSize.height - getSize().height) / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setVisible(true);
    }

}
