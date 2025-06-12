public class HelloPlayer {
    private final String name;
    private int hp = 100;  // points de vie initialisés à 100

    public HelloPlayer(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Bonjour, je suis " + name + " !");
    }

    public void takeDamage(int amount) {
        hp -= amount;
        System.out.println(name + " a pris " + amount + " dégâts. Points de vie restants : " + hp);
    }

    // Bonus : méthode isAlive
    public boolean isAlive() {
        return hp > 0;
    }

    public static void main(String[] args) {
        HelloPlayer p = new HelloPlayer("Jodel");
        p.greet();
        p.takeDamage(15);
        System.out.println("Est-ce que " + p.name + " est en vie ? " + p.isAlive());
    }
}
