package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
    public void checkBlockCollision(){
        if(y<=410){
            for (var val : Punkt.punkty){
                int xPoint = val.getX()*80;
                int yPoint = val.getY()*40;
                if(x>=xPoint && x<=xPoint+80 && y>=yPoint && y<=yPoint+40){
                    dy=-dy;
                }
            }
        }
    }
}
