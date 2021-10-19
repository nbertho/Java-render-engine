package com.berthoenterprise.engine.gamecontroller;

import com.berthoenterprise.engine.gamecontroller.gameenum.Status;

public class GameController {

    protected Status status = Status.START;

    protected boolean gameStarted = false;
    protected boolean optionsStarted = false;
    protected boolean pauseStarted = false;

    protected Game game;
    protected Options options;
    protected Pause pause;


    // GETTERS

    public Status getStatus() {
        return this.status;
    }

    public boolean isGameStarted() {
        return this.gameStarted;
    }

    public boolean isOptionsStarted() {
        return this.optionsStarted;
    }

    public boolean isPauseStarted() {
        return this.pauseStarted;
    }


    // SETTERS

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setGameHasStarted() {
        this.gameStarted = true;
    }

    public void setOptionsHasStarted() {
        this.gameStarted = true;
    }

    public void setPauseHasStarted() {
        this.gameStarted = true;
    }


    public void start() {

        switch (this.status) {

            case GAME:
                if (this.isGameStarted()) {
                    Status newStatus = this.game.run();
                    this.setStatus(newStatus);
                } else {
                    this.game = new Game();
                    this.setGameHasStarted();
                }
                break;

            case OPTIONS:
                if (this.isOptionsStarted()) {
                    Status newStatus = this.options.run();
                    this.setStatus(newStatus);
                } else {
                    this.options = new Options();
                    this.setOptionsHasStarted();
                }
                break;

            case PAUSE:
                if (this.isPauseStarted()) {
                    Status newStatus = this.pause.run();
                    this.setStatus(newStatus);
                } else {
                    this.pause = new Pause();
                    this.setPauseHasStarted();
                }
                break;


        }

    }

}
