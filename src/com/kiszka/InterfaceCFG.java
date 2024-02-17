package com.kiszka;

import javax.swing.*;
import java.awt.*;

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
    }

    public static void main(String[] args) {
        new InterfaceCFG();
    }
}
