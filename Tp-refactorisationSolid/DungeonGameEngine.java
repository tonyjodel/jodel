public class DungeonGameEngine implements GameEngine {
    private final CombatService combatService;
    private final SauvegardeService sauvegardeService;

    public DungeonGameEngine(CombatService combatService, SauvegardeService sauvegardeService) {
        this.combatService = combatService;
        this.sauvegardeService = sauvegardeService;
    }

    @Override
    public void initialiser() {
        System.out.println("[Dungeon] Jeu initialisé !");
    }

    @Override
    public void tour() {
        System.out.println("[Dungeon] Un tour de jeu !");
    }

    @Override
    public boolean estTermine() {
        return false;
    }
}
