package com.kiszka;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    private static final int BLOCK_WIDTH = 80;
    private static final int BLOCK_HEIGHT = 40;
    {
        this.setBackground(Color.black);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                g2d.drawRect(i*BLOCK_WIDTH,j*BLOCK_HEIGHT,BLOCK_WIDTH,BLOCK_HEIGHT);
            }
        }
    }
}
