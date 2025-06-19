public class Utilisateur {
    private String email;
    private String telephone;
    private int age;

    public void setEmail(String email) throws EmailInvalideException {
        Validateur.validerEmail(email);
        this.email = email;
    }

    public void setTelephone(String telephone) throws TelephoneInvalideException {
        Validateur.validerTelephone(telephone);
        this.telephone = telephone;
    }

    public void setAge(int age) throws AgeInvalideException {
        Validateur.validerAge(age);
        this.age = age;
    }

    public String toString() {
        return "Email: " + email + ", Téléphone: " + telephone + ", Âge: " + age;
    }
}

