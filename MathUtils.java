public class MathUtils {

    // Méthode pour calculer le PGCD avec l’algorithme d’Euclide
    public static int pgcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return pgcd(b, a % b);
    }

    public static void main(String[] args) {
        int result = pgcd(42, 30);
        System.out.println("PGCD de 42 et 30 = " + result);  // Doit afficher 6

        // Test avec assert (active avec java -ea)
        assert result == 6 : "Le PGCD devrait être 6";
        System.out.println("Test réussi.");
    }
}
