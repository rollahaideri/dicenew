package com.krillinator.game;

import java.util.concurrent.ThreadLocalRandom;

public class Opponent {
    private String name;



    public int throwDie(){
        int die1 = 0, die2 = 0;
        die1 = ThreadLocalRandom.current().nextInt(1,7);
        die2 = ThreadLocalRandom.current().nextInt(1,7);
        return die1 + die2;
    }

    //Constructor
    public Opponent(String name) {
        this.name = name;
    }
    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
