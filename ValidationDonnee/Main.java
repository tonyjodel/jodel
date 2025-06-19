public class Main {
    public static void main(String[] args) {
        Utilisateur user = new Utilisateur();

        try {
            user.setEmail("tonyjodel@mail.com");
            user.setTelephone("0612345678");
            user.setAge(24);
            System.out.println("Utilisateur valide : " + user);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
