import java.util.concurrent.ThreadLocalRandom;

class Weapon {
    private final int minDamage;
    private final int maxDamage;

    public Weapon(int minDamage, int maxDamage) {
        if (minDamage > maxDamage) {
            throw new IllegalArgumentException("minDamage ne peut pas être supérieur à maxDamage");
        }
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int rollDamage() {
        return ThreadLocalRandom.current().nextInt(minDamage, maxDamage + 1);
    }

    @Override
    public String toString() {
        return "Weapon(" + minDamage + "-" + maxDamage + " dégâts)";
    }
}

public class HelloPlayer2 {
    private final String name;
    private int hp = 100;
    private final Weapon weapon;

    public HelloPlayer2(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
        System.out.println(name + " a pris " + amount + " dégâts. Points de vie restants : " + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void attack(HelloPlayer2 target) {
        int damage = weapon.rollDamage();
        System.out.println(name + " attaque " + target.name + " avec " + weapon + " pour " + damage + " dégâts.");
        target.takeDamage(damage);
    }

    public static void main(String[] args) {
        // Active les assertions avec: java -ea HelloPlayer
        Weapon sword = new Weapon(10, 20);
        HelloPlayer2 bob = new HelloPlayer2("Bob", sword);
        HelloPlayer2 alice = new HelloPlayer2("Alice", new Weapon(5, 15));

        bob.greet();
        alice.greet();

        bob.attack(alice);
        assert alice.isAlive() : "Alice devrait être vivante après une attaque";

        alice.attack(bob);
        bob.takeDamage(85);
        assert bob.isAlive() : "Bob devrait survivre";

        bob.takeDamage(15);
        assert !bob.isAlive() : "Bob aurait dû être KO";

        System.out.println("Tests terminés.");
    }
}
