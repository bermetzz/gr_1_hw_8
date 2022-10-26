package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int n = RPG_Game.random.nextInt(5) + 1;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getDamage() + n);
            }
        }
        System.out.println("Magic increased attack of heroes by " + n);

    }
}
