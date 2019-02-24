package by.vit.strategy.characters;

import by.vit.strategy.weapon.WeaponBehavior;

public class Princess extends Character {

    @Override
    public void setWeapon(WeaponBehavior weapon) {
        System.out.println("Princess can't use weapon");
    }

    @Override
    public Integer fight(){
        return 0;
    }
}
