package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.PI;

@AllArgsConstructor
@Getter @Setter
public class Ball {
    final int RADIUS = 10;
    final int VELOCITY = 5;
    int x;
    int y;
    double angle;
    public Ball(){
        this.x=390;
        this.y=700;
        this.angle=Math.PI/4;
    }
    public void move(){

    }
}

