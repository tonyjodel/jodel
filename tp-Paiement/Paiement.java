public interface Paiement {
    boolean payer(double montant);
    double getSolde();
    String getType();
}
