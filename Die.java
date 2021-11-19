package com.krillinator.game;

import java.util.concurrent.ThreadLocalRandom;

public class Die implements IGame {

    private int currentSide;



    @Override
    public int throwDie() {
        int die1 = 0, die2 = 0;
        die1 = ThreadLocalRandom.current().nextInt(1,7);
        die2 = ThreadLocalRandom.current().nextInt(1,7);
        return die1 + die2;
    }
    //Constructor
    public Die(int currentSide) {
        this.currentSide = currentSide;

    }
    //Getter
    public int getCurrentSide() {
        return currentSide;
    }
    //Setter
    public void setCurrentSide(int currentSide) {
        this.currentSide = currentSide;
    }
}
