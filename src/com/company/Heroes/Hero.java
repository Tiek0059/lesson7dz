package com.company.Heroes;

import com.company.Interfaces.HavingSuperAbility;

public abstract class Hero implements HavingSuperAbility {

    private int heals,damage;
    private String attackType;

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
}