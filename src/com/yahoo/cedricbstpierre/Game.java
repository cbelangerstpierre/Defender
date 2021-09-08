package com.yahoo.cedricbstpierre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener {
    public static final int GAME_WIDTH = 650;
    public static final int GAME_HEIGHT = 650;

    private final Heart heart;
    private final Enemy enemy;

    Game() {
        heart = new Heart();
        enemy = new Enemy(this);

        setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        setBackground(Color.black);
        System.out.println(this.getSize());
        System.out.println(new Dimension(GAME_WIDTH, GAME_HEIGHT));

        paintImmediately(getVisibleRect());

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        heart.draw(g2D);
        enemy.draw(g2D);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
