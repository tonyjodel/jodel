public class Joueur {
    private String id;
    private int force;
    private int pointsDeVie;
    private Arme arme;

    public Joueur(String id, int force, int pointsDeVie, Arme arme) {
        this.id = id;
        this.force = force;
        this.pointsDeVie = pointsDeVie;
        this.arme = arme;
    }

    public int getForce() {
        return force;
    }

    public Arme getArme() {
        return arme;
    }

    public void subirDegats(int degats) {
        this.pointsDeVie -= degats;
        System.out.println("[Joueur] " + id + " a subi " + degats + " dégâts. PV restants : " + pointsDeVie);
    }
}
