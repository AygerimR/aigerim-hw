public class Hero {
    private int health = 250;
    private int damage = 50;
    private String superPower = ("Fire");

    public Hero(int theHealth, int theDamage, String theSuperPower) {
        health = theHealth;
        damage = theDamage;
        superPower = theSuperPower;
    }
    public Hero(int theHealth, int theDamage) {
        health = theHealth;
        damage = theDamage;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
