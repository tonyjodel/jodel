public class TelephoneInvalideException extends Exception {
    public TelephoneInvalideException(String telephone) {
        super("Numéro de téléphone invalide : " + telephone);
    }
}

