public class Main {
    public static void main(String[] args) {
        Boss villain = new Boss(200,60, "Fire");
        System.out.println("About the boss: " +  "Health " + villain.getBossHealth() + " Damage " + villain.getBossDamage()
                + " Protection " + villain.getBossProtection());

    }
}