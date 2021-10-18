package com.berthoenterprise.engine.entity;

public class Object extends Entity {

    protected boolean rotation = false;
    protected boolean pickable = true;


    // GETTERS

    public boolean isRotation() {
        return this.rotation;
    }

    public boolean isPickable() {
        return this.pickable;
    }


    // SETTERS

    public void setRotation(boolean newValue) {
        this.rotation = newValue;
    }

    public void setPickable(boolean newValue) {
        this.pickable = newValue;
    }

}
