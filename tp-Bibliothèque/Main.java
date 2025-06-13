public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bibliotheque bib = new Bibliotheque();

        Livre l1 = new Livre("123", "Le Petit Prince", "Saint-Exupéry");
        Livre l2 = new Livre("456", "1984", "George Orwell");
        bib.ajouterLivre(l1);
        bib.ajouterLivre(l2);

 
        bib.emprunterLivre("123", "Alice", 7);

     
        bib.emprunterLivre("123", "Bob", 7);

        
        bib.reserverLivre("123", "Bob");


        Thread.sleep(2000); 

        double penalite = bib.retournerLivre("123");
        System.out.println("Pénalité payée: " + penalite);
    }
}

