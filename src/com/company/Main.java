package com.company;

import com.company.Heroes.Hero;
import com.company.Heroes.Magic;
import com.company.Interfaces.HavingSuperAbility;
import com.company.Heroes.Medic;
import com.company.Heroes.Warrior;

public class Main {

    public static void main(String[] args) {

        //Processing
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] ability = {(HavingSuperAbility) magic, medic, warrior};

        //Output
        for (int i = 0; i < ability.length; i++) {
            ((Hero) ability[i]).applySuperAbility();
        }
    }
}