package com.berthoenterprise.engine.entity;

public class Entity {

    protected int posX = 0;
    protected int posY = 0;
    protected int tileX = 0;
    protected int tileY = 0;
    protected long angle = 0L;
    protected boolean alive = true;


    // GETTERS

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public int getTileX() {
        return this.tileX;
    }

    public int getTileY() {
        return this.tileY;
    }

    public long getAngle() {
        return this.angle;
    }

    public boolean isAlive() {
        return this.alive;
    }


    // SETTERS

    public void setPosX(int newPos) {
        this.posX = newPos;
    }

    public void setPosY(int newPos) {
        this.posY = newPos;
    }

    public void setTileX(int newTile) {
        this.tileX = newTile;
    }

    public void setTileY(int newTile) {
        this.tileY = newTile;
    }

    public void setAngle(long newAngle) {
        this.angle = newAngle;
    }

    public void setAlive() {
        this.alive = true;
    }

    public void setDead() {
        this.alive = false;
    }

}
