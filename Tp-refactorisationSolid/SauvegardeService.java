public interface SauvegardeService {
    void sauvegarder(Joueur joueur);
    Joueur charger(String id);
}
