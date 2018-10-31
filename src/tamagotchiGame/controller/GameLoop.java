package tamagotchiGame.controller;

import tamagotchiGame.model.Tamagotchi;

import java.util.TimerTask;

public class GameLoop extends TimerTask {

    private Tamagotchi tamagotchi;

    public GameLoop(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    public void run() {
        tamagotchi.decreaseFood();
        System.out.println(tamagotchi.getFood());

    }
}

