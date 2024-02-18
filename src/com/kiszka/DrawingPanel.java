package com.kiszka;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Math.*;

public class DrawingPanel extends JPanel {
    static final Ball ball;
    static final Paddle paddle;
    static final Random random = new Random();
    static final int BLOCK_WIDTH = 80;
    static final int BLOCK_HEIGHT = 40;
    static{
        ball = new Ball();
        paddle = new Paddle();
    }

    public DrawingPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
    }
    public void run(){
        ball.move();
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
        g2d.drawOval(ball.getX(),ball.getY(),2* ball.getRADIUS(),2* ball.getRADIUS());
        g2d.fillOval(ball.getX(),ball.getY(),2* ball.getRADIUS(),2* ball.getRADIUS());
        g2d.drawRect(paddle.getX_POS(),Paddle.Y_POS,Paddle.WIDTH,Paddle.HEIGHT);
        g2d.fillRect(paddle.getX_POS(),Paddle.Y_POS,Paddle.WIDTH,Paddle.HEIGHT);
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
    int x;
    int y;
    static List<Punkt> punkty;
    static{
        punkty = new ArrayList<>();
    }
    Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
}
