import java.util.*;

public class Bibliotheque {
    private Map<String, Livre> livres;
    private Map<String, List<Livre>> livresParAuteur;
    private Map<Livre, Emprunt> empruntsActifs;
    private Map<Livre, Queue<String>> reservations; 

    public Bibliotheque() {
        this.livres = new HashMap<>();
        this.livresParAuteur = new HashMap<>();
        this.empruntsActifs = new HashMap<>();
        this.reservations = new HashMap<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.put(livre.getIsbn(), livre);
        livresParAuteur.computeIfAbsent(livre.getAuteur(), k -> new ArrayList<>()).add(livre);
    }

    public Livre rechercherParIsbn(String isbn) {
        return livres.get(isbn);
    }

    public List<Livre> rechercherParAuteur(String auteur) {
        return livresParAuteur.getOrDefault(auteur, new ArrayList<>());
    }

    public boolean emprunterLivre(String isbn, String utilisateur, int dureeJours) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println("Livre non trouvé.");
            return false;
        }
        if (!livre.isDisponible()) {
            System.out.println("Livre non disponible. Voulez-vous le réserver ?");
            return false;
        }
        Emprunt emprunt = new Emprunt(livre, dureeJours);
        empruntsActifs.put(livre, emprunt);
        System.out.println(utilisateur + " a emprunté : " + livre);
        return true;
    }

    public double retournerLivre(String isbn) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println("Livre non trouvé.");
            return 0;
        }
        Emprunt emprunt = empruntsActifs.remove(livre);
        if (emprunt == null) {
            System.out.println("Ce livre n’est pas emprunté.");
            return 0;
        }
        double penalite = emprunt.retournerLivre();

        if (reservations.containsKey(livre) && !reservations.get(livre).isEmpty()) {
            String prochain = reservations.get(livre).poll();
            System.out.println("Notification: " + prochain + ", le livre " + livre.getTitre() + " est maintenant disponible.");
        }

        return penalite;
    }

    public boolean reserverLivre(String isbn, String utilisateur) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println("Livre non trouvé.");
            return false;
        }
        if (livre.isDisponible()) {
            System.out.println("Le livre est disponible, pas besoin de réserver.");
            return false;
        }
        reservations.computeIfAbsent(livre, k -> new LinkedList<>()).add(utilisateur);
        System.out.println(utilisateur + " a réservé le livre : " + livre.getTitre());
        return true;
    }
}
