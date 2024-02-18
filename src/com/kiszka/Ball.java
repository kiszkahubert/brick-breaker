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

    }
}
