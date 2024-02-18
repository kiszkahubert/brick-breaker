package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

import static com.kiszka.DrawingPanel.BLOCK_HEIGHT;
import static com.kiszka.DrawingPanel.BLOCK_WIDTH;

@AllArgsConstructor
@Getter @Setter
public class Ball {
    Paddle paddle;
    final int RADIUS = 10;
    final int VELOCITY = 5;
    int x;
    int y;
    int dx = VELOCITY;
    int dy = -VELOCITY;

    public Ball(Paddle paddle){
        this.paddle = paddle;
        this.x=390;
        this.y=700;
    }

    public void move(){
        checkWallCollision();
        checkPaddleCollision();
        checkBlockCollision();
        x += dx;
        y += dy;
    }

    public void checkWallCollision(){
        if(x - RADIUS <= 0 || x + RADIUS >= 800){
            dx = -dx;
        }
        if(y - RADIUS <= 0 || y + RADIUS >= 800){
            dy = -dy;
        }
    }
    public void checkPaddleCollision(){
        int paddleWidthRange = paddle.getX_POS()+80;
        if(x>=paddle.getX_POS() && x<=paddleWidthRange && y==760){
            dy=-dy;
        }
    }
    public void checkBlockCollision() {
        if (y <= 410) {
            Iterator<Punkt> iterator = Punkt.punkty.iterator();
            while (iterator.hasNext()) {
                Punkt val = iterator.next();
                int xPoint = val.getX() * BLOCK_WIDTH;
                int yPoint = val.getY() * BLOCK_HEIGHT;
                if (x >= xPoint && x <= xPoint + BLOCK_WIDTH && y >= yPoint && y <= yPoint + BLOCK_HEIGHT) {
                    dy = -dy;
                    iterator.remove();
                }
            }
        }
    }
}
