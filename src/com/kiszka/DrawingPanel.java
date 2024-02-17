package com.kiszka;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawingPanel extends JPanel {
    private static final Random random = new Random();
    private static final int BLOCK_WIDTH = 80;
    private static final int BLOCK_HEIGHT = 40;

    public DrawingPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
    }
    public void run(){

        repaint();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for(var pkt : Punkt.punkty){
            g2d.setColor(Color.BLACK);
            g2d.fillRect(pkt.getX()*BLOCK_WIDTH,pkt.getY()*BLOCK_HEIGHT, BLOCK_WIDTH, BLOCK_HEIGHT);
            g2d.setColor(Color.RED);
            g2d.drawRect(pkt.getX()*BLOCK_WIDTH,pkt.getY()*BLOCK_HEIGHT, BLOCK_WIDTH, BLOCK_HEIGHT);
        }
        g2d.setColor(Color.red);
    }
    public void generate(){
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            Punkt.punkty.add(new Punkt(x,y));
        }
    }
}
@Getter @Setter
class Punkt{
    private int x;
    private int y;
    protected static List<Punkt> punkty;
    static{
        punkty = new ArrayList<>();
    }
    Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
}
