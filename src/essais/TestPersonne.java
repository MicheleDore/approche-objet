package essais;
import entites.AdressePostale;
import entites.Personne;
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Jean", "Marue");
        personne1.nom = "Jean";
        personne1.prenom = "Marue";

        Personne personne2 = new Personne("Jeanne", "Marue");
        personne2.nom = "Jeanne";
        personne2.prenom = "Marue";
        personne2.adresse = new AdressePostale(4, "Sarue", 44300, "Nantes");
    }
}

