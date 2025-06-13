public class MainPaiement {
    public static void main(String[] args) {
        GestionnairePaiement gestionnaire = new GestionnairePaiement();
        gestionnaire.ajouterMethode(new PaiementCarte("1234 5678 9012 3456", 50.0));
        gestionnaire.ajouterMethode(new PaiementPayPal("jodel@email.com", 30.0));

        gestionnaire.effectuerPaiement(20.0);
        gestionnaire.effectuerPaiement(40.0); 
        gestionnaire.effectuerPaiement(100.0); 
    }
}
