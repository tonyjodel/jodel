public class Carte2 extends Carte2 {
    private final String couleur;

    public Carte2(String couleur, int valeur) {
        super(valeur + " de " + couleur, valeur);
        this.couleur = couleur;
    }

    @Override
    public void jouer() {
        System.out.println("Je joue le " + nom);
    }
}
