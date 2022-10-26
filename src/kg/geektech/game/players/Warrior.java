package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(2) + 2; // 2,3,4,5,6
        boss.setHealth(boss.getHealth() - coefficient * this.getDamage());
        System.out.println("Warrior hits critically " + coefficient * this.getDamage());
    }
}
