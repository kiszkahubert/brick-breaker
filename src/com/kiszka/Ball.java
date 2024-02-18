package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Ball {
    final int RADIUS = 10;
    final int VELOCITY = 5;
    int x;
    int y;
    double angle;
    public void move(){
        checkBorderCollision();
        double dx = VELOCITY*Math.sin(angle);
        double dy = -VELOCITY+Math.cos(angle);
        x+= (int) dx;
        y+= (int) dy;
    }
    public void checkBorderCollision(){
        int halfOfRadius = RADIUS/2;
        if(x+halfOfRadius>=800){
            x=800-halfOfRadius;
            angle=-angle;
        } else if (x-halfOfRadius<0){
            x=halfOfRadius;
            angle=-angle;
        }
        if(y+halfOfRadius>=800){
            y=800-halfOfRadius;
            angle=Math.PI - angle;
        } else if (y-halfOfRadius<=0){
            y=halfOfRadius;
            angle=Math.PI-angle;
        }
    }
}
