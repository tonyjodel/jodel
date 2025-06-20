public class SauvegardeServiceDummy implements SauvegardeService {
    @Override
    public void sauvegarder(Joueur joueur) {
        System.out.println("[Sauvegarde] Joueur sauvegardé !");
    }

    @Override
    public Joueur charger(String id) {
        System.out.println("[Sauvegarde] Chargement du joueur " + id);
        return new Joueur(id, 10, 100, new Epee());
    }
}
