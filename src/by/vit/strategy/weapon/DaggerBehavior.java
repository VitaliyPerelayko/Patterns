package by.vit.strategy.weapon;


public class DaggerBehavior implements WeaponBehavior {
    @Override
    public Integer useWeapon(int level) {
        Integer damage1 = damage.nextInt(level)+level;
        System.out.println("Dagger deals "+damage1+ "damage");
        return damage1;
    }
}
