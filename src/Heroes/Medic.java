package com.company.Heroes;

import com.company.Heroes.Hero;

public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Медик   |применил суперспособность| Healing!!!");
    }
}