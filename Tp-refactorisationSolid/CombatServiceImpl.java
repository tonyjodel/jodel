import java.util.Random;

public class CombatServiceImpl implements CombatService {
    private final CalculDegatsStrategy calculDegatsStrategy;
    private final Random random;

    public CombatServiceImpl(CalculDegatsStrategy calculDegatsStrategy, Random random) {
        this.calculDegatsStrategy = calculDegatsStrategy;
        this.random = random;
    }

    @Override
    public int calculerDegats(Joueur attaquant, Joueur defenseur) {
        int degats = calculDegatsStrategy.calculerDegats(attaquant, defenseur);
        int variation = random.nextInt(5);
        return degats + variation;
    }

    @Override
    public void appliquerDegats(Joueur cible, int degats) {
        cible.subirDegats(degats);
    }
}
