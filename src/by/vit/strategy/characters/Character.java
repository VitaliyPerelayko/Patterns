package by.vit.strategy.characters;

import by.vit.strategy.weapon.WeaponBehavior;

public abstract class Character {
    private int level;
    private WeaponBehavior weapon = null;

    public Integer fight(){
        if (weapon==null){
            System.out.println(this.getClass().getSimpleName()+" deal "+level+" damage");
            return level;
        }
        return weapon.useWeapon(level);
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
