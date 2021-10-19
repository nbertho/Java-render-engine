package com.berthoenterprise.engine.entity.livingentities;

import com.berthoenterprise.engine.entity.LivingEntity;

public class Enemy extends LivingEntity {

    protected String name;

    public Enemy(
            String name
    ) {
        this.name = name;
        this.setAnimationName(name.toLowerCase().strip());
    }

}
