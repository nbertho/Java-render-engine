package com.berthoenterprise.engine.gamecontroller;

import com.berthoenterprise.engine.gamecontroller.gameenum.Status;

public class Game {

    public Status run() {
        System.out.println("Game is running");
        return Status.GAME;
    }

}
