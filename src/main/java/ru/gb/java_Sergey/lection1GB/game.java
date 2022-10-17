package ru.gb.java_Sergey.lection1GB;

import javax.swing.*;
import java.awt.*;

public class game extends JFrame {
    private static game Game;

    public static void main(String[] args) {
        Game = new game();
        Game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Game.setLocation(200, 100);
        Game.setSize(906, 478);
        Game.setResizable(false);
        GameField game_field = new GameField();
        Game.add(game_field);
        Game.setVisible(true);
    }
    private static void onRepaint(Graphics g) {
        g.fillOval(10, 10, 200, 100);
        g.drawLine(15, 15, 400, 300);

    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent(g);
            onRepaint(g);

        }
    }
}
