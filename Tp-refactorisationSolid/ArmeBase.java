public abstract class ArmeBase implements Arme {
    protected final String nom;
    protected final int multiplicateur;

    protected ArmeBase(String nom, int multiplicateur) {
        this.nom = nom;
        this.multiplicateur = multiplicateur;
    }

    @Override
    public int calculerDegats(int force) {
        return force * multiplicateur;
    }

    @Override
    public String getDescription() {
        return nom;
    }
}
