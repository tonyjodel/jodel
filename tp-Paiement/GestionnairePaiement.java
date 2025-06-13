import java.util.ArrayList;
import java.util.List;

public class GestionnairePaiement {
    private List<Paiement> methodes;

    public GestionnairePaiement() {
        this.methodes = new ArrayList<>();
    }

    public void ajouterMethode(Paiement methode) {
        methodes.add(methode);
    }

    public boolean effectuerPaiement(double montant) {
        for (Paiement p : methodes) {
            if (p.payer(montant)) {
                System.out.println("Paiement effectué via " + p.getType());
                return true;
            }
        }
        System.out.println("Échec du paiement : fonds insuffisants.");
        return false;
    }
}
