public class CalculDegatsSimple implements CalculDegatsStrategy {
    @Override
    public int calculerDegats(Joueur attaquant, Joueur defenseur) {
        Arme arme = attaquant.getArme();
        return arme.calculerDegats(attaquant.getForce());
    }
}
