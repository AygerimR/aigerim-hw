public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossProtection;

    public Boss(int theBossHealth, int theBossDamage, String theBossProtection) {
        bossHealth = theBossHealth;
        bossDamage = theBossDamage;
        bossProtection = theBossProtection;

    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossProtection() {
        return bossProtection;
    }

    public void setBossProtection(String bossProtection) {
        this.bossProtection = bossProtection;
    }
}

