package by.vit.strategy.weapon;


public class AxeBehavior implements WeaponBehavior {
    @Override
    public Integer useWeapon(int level) {
        Integer damage1 = damage.nextInt(level)+level;
        System.out.println("Axe deals "+damage1+ "damage");
        return damage1;
    }
}
