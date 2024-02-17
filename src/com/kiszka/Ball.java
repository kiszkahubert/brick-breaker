package com.kiszka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Ball {
    static final int RADIUS = 20;
    static final int VELOCITY = 20;
    int x;
    int y;

}
