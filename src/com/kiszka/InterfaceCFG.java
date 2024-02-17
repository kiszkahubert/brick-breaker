package com.kiszka;

import javax.swing.*;

public class InterfaceCFG extends JFrame{
    {
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.add(new DrawingPanel());
    }

    public static void main(String[] args) {
        new InterfaceCFG();
    }
}
