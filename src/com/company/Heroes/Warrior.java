package com.company.Heroes;

import com.company.Heroes.Hero;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior |применил суперспособность| CriticalDamage!!!");
    }
}