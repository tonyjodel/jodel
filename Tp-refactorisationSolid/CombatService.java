public interface CombatService {
    int calculerDegats(Joueur attaquant, Joueur defenseur);
    void appliquerDegats(Joueur cible, int degats);
}
