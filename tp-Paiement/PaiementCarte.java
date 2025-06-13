public class PaiementCarte implements Paiement {
    private String numero;
    private double solde;

    public PaiementCarte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public boolean payer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public String getType() {
        return "Carte bancaire";
    }
}
