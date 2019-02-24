package by.vit.strategy.weapon;


public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public Integer useWeapon(int level) {
        Integer damage1 = damage.nextInt(level)+level;
        System.out.println("Bow deals "+damage1+ "damage");
        return damage1;
    }
}