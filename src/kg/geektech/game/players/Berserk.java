package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    public int getSavedDamage() {
        return savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.setSavedDamage(boss.getDamage() - (int)(0.2*boss.getDamage())) ;
        boss.setHealth(boss.getHealth()-this.getSavedDamage());
        System.out.println("Berserk's saved damage is "+this.getSavedDamage());
    }
}