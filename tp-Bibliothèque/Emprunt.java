import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprunt {
    private final Livre livre;
    private final LocalDate dateEmprunt;
    private final LocalDate dateRetourPrevu;
    private LocalDate dateRetourReel; 

    public Emprunt(Livre livre, int dureeJours) {
        this.livre = livre;
        this.dateEmprunt = LocalDate.now();
        this.dateRetourPrevu = dateEmprunt.plusDays(dureeJours);
        this.dateRetourReel = null;
        livre.setDisponible(false);
    }

    public Livre getLivre() {
        return livre;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetourPrevu() {
        return dateRetourPrevu;
    }

    public LocalDate getDateRetourReel() {
        return dateRetourReel;
    }

    public double retournerLivre() {
        this.dateRetourReel = LocalDate.now();
        livre.setDisponible(true);
        long joursRetard = ChronoUnit.DAYS.between(dateRetourPrevu, dateRetourReel);
        if (joursRetard > 0) {
            double penalite = joursRetard * 1.5; 
            System.out.println("Retour avec " + joursRetard + " jours de retard. Pénalité = " + penalite);
            return penalite;
        }
        System.out.println("Retour dans les temps, pas de pénalité.");
        return 0;
    }

    public boolean estEnRetard() {
        return dateRetourReel == null && LocalDate.now().isAfter(dateRetourPrevu);
    }
}
