package by.vit.strategy.characters;

import by.vit.strategy.weapon.WeaponBehavior;

public class Troll extends Character {

    @Override
    public void setWeapon(WeaponBehavior weapon) {
        System.out.println("Troll can't use weapon");
    }
}
