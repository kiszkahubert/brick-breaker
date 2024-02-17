package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Ball {
    final int RADIUS = 10;
    final int VELOCITY = 20;
    int x;
    int y;
    double angle;
}
