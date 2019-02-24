package by.vit.strategy.weapon;

import java.util.Random;

public interface WeaponBehavior {
    Random damage = new Random();
    Integer useWeapon(int level);
}
