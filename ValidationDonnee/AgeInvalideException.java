public class AgeInvalideException extends Exception {
    public AgeInvalideException(int age) {
        super("Âge invalide : " + age);
    }
}
