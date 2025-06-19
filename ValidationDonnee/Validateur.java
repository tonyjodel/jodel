public class Validateur {

    public static void validerEmail(String email) throws EmailInvalideException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EmailInvalideException(email);
        }
    }

    public static void validerTelephone(String telephone) throws TelephoneInvalideException {
        if (telephone == null || !telephone.matches("^\\d{10}$")) {
            throw new TelephoneInvalideException(telephone);
        }
    }

    public static void validerAge(int age) throws AgeInvalideException {
        if (age < 0 || age > 120) {  
            throw new AgeInvalideException(age);
        }
    }
}
