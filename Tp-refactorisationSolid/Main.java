import java.util.Random;

public class Main {
    public static void main(String[] args) {
      
        Arme epee = new Epee();
        Joueur joueur1 = new Joueur("Tony", 10, 100, epee);
        Joueur joueur2 = new Joueur("Monstre", 5, 50, epee);


        CombatService combatService = new CombatServiceImpl(new CalculDegatsSimple(), new Random());
        SauvegardeService sauvegardeService = new SauvegardeServiceDummy();
        GameEngine jeu = new DungeonGameEngine(combatService, sauvegardeService);

      
        jeu.initialiser();
        jeu.tour();

        
        int degats = combatService.calculerDegats(joueur1, joueur2);
        combatService.appliquerDegats(joueur2, degats);
    }
}
