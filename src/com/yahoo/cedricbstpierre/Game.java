package com.yahoo.cedricbstpierre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class Game extends JPanel implements KeyListener {
    public final int FPS = 60;
    private boolean killed = false;

    public static final int GAME_WIDTH = 650;
    public static final int GAME_HEIGHT = 650;

    private final Heart heart;
    private final Enemy enemy;

    public List<Enemy> enemies = new ArrayList<>();

    Game() {
        heart = new Heart();
        enemy = new Enemy(this);
        enemies.add(new Enemy(this));

        setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        setBackground(Color.black);

        paintImmediately(getVisibleRect());

    }

    void NewGame() {
        Run();
    }

    TimerTask Run() {
        new Thread(() -> {
            while(!killed) {

                enemy.move();
                try {
                    Thread.sleep(1000 / FPS);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
        return null;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        heart.draw(g2D);
        //enemies.forEach()
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
