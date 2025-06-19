    public class EmailInvalideException extends Exception {
    public EmailInvalideException(String email) {
        super("Email invalide : " + email);
    }
}


