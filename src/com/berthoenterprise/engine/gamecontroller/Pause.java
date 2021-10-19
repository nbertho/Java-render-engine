package com.berthoenterprise.engine.gamecontroller;

import com.berthoenterprise.engine.gamecontroller.gameenum.Status;

public class Pause {

    public Status run() {
        System.out.println("Pause is running");
        return Status.PAUSE;
    }

}
