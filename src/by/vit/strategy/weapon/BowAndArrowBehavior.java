package by.vit.strategy.weapon;


public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public Integer useWeapon() {
        Integer damage1 = damage.nextInt();
        System.out.println("Dagger deals "+damage1+ "damage");
        return damage1;
    }
}