package com.kiszka;

import javax.swing.*;
import java.awt.*;

import static com.kiszka.DrawingPanel.paddle;

public class InterfaceCFG extends JFrame{
    public InterfaceCFG(){
        this.setUndecorated(true);
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DrawingPanel drawingPanel = new DrawingPanel();
        drawingPanel.generate();
        drawingPanel.setPreferredSize(new Dimension(800,800));
        this.add(drawingPanel);
        this.pack();
        drawingPanel.addKeyListener(paddle);
        drawingPanel.setFocusable(true);
        drawingPanel.requestFocusInWindow();
        drawingPanel.run();
        Timer timer = new Timer(1,e->drawingPanel.run());
        timer.start();
    }

    public static void main(String[] args) {
        new InterfaceCFG();
    }
}
