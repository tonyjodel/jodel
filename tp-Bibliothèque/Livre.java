public class Livre {
    private final String isbn;
    private final String titre;
    private final String auteur;
    private boolean disponible;

    public Livre(String isbn, String titre, String auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titre + " par " + auteur + " (ISBN: " + isbn + ") " + (disponible ? "[Disponible]" : "[Emprunté]");
    }
}
