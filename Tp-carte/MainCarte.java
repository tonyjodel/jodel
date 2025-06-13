public class MainCarte {
    public static void main(String[] args) {
        Carte[] main = new Carte[3];

        main[0] = new Carte("Cœur", 7);
        main[1] = new Carte2("Joker", "Change la couleur");
        main[2] = new Carte3("Pique", 1);

        for (Carte c : main) {
            c.jouer();
        }
    }
}
