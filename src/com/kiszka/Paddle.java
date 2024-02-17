package com.kiszka;

import lombok.Getter;
import lombok.Setter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
@Getter
@Setter
public class Paddle implements KeyListener {
    static final int WIDTH = 80;
    static final int HEIGHT = 20;
    static final int VELOCITY = 20;
    static final int Y_POS = 760;
    int X_POS = 360;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37 ->{
                if(X_POS-VELOCITY>=0) X_POS -= VELOCITY;
            }
            case 39 ->{
                if(X_POS+VELOCITY<=700) X_POS += VELOCITY;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
