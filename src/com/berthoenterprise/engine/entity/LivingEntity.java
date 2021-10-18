package com.berthoenterprise.engine.entity;

public class LivingEntity extends Entity {

    protected int hp = 0;

    protected int speed = 0;

    protected String animationName;

    protected boolean dropOnDeath = false;


    // GETTERS

    public int getHp() {
        return this.hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getAnimationName() {
        return this.animationName;
    }

    public boolean isDropOnDeath() {
        return this.dropOnDeath;
    }

    // SETTERS

    public void setHp(int newValue) {
        this.hp = this.hp + newValue;
    }

    public void setHp(int newValue, boolean global) {
        if (global) {
            this.hp = newValue;
        }
    }

    public void setSpeed(int newValue) {
        this.speed = this.speed + newValue;
    }

    public void setSpeed(int newValue, boolean global) {
        if (global) {
            this.speed = newValue;
        }
    }

    public void setAnimationName(String animationName) {
        this.animationName = animationName;
    }

    public void isDropOnDeath(boolean newValue) {
        this.dropOnDeath = newValue;
    }

}
