package by.vit.strategy;

import by.vit.strategy.characters.*;
import by.vit.strategy.characters.Character;
import by.vit.strategy.weapon.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        characters.add(new King());
        characters.add(new Troll());
        characters.add(new Princess());
        WeaponBehavior axe = new AxeBehavior();
        characters.forEach(character -> character.setLevel(49));
        characters.forEach(character -> character.setWeapon(axe));
        characters.forEach(Character::fight);
    }
}
