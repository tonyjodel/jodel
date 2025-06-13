public class Carte3 extends Carte {
    private final String effet;

    public Carte3(String nom, String effet) {
        super(nom, 0);  
        this.effet = effet;
    }

    @Override
    public void jouer() {
        System.out.println("J'active l'effet : " + effet);
    }
}
