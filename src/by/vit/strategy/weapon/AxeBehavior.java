package by.vit.strategy.weapon;



public class AxeBehavior implements WeaponBehavior {
    @Override
    public Integer useWeapon() {
        Integer daggerDamage = damage.nextInt();
        System.out.println("Dagger deals "+daggerDamage+ "damage");
        return daggerDamage;
    }
}
