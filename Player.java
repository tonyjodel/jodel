// Player.java
public class Player {
    private final String name;
    public Player(String name) {
        this.name = name;
}
    public void greet() {
        System.out.println("Bonjour, je suis "
+ name + " !");
    }
    public static void main(String[] args) {
        Player p = new Player("Alice");
        p.greet();
} }