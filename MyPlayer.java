// MyPlayer.java
public class MyPlayer {
    private final String pseudo;

    public MyPlayer(String pseudo) {
        this.pseudo = pseudo;
    }

    public void greet() {
        System.out.println("Salut, je suis " + pseudo + " !");
    }

    public static void main(String[] args) {
        MyPlayer p = new MyPlayer("Bob");
        p.greet();
    }
}
