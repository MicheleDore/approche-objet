package essais;
import entites.AdressePostale;
import entites.Personne;
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Marue", "Jean");

        Personne personne2 = new Personne("Marue", "Jeanne");
        personne2.adresse = new AdressePostale(4, "Sarue", 44300, "Nantes");

        personne2.setAdresse(personne2.adresse);
        System.out.println(personne2.adresse.ville);
        personne1.afficheNom();

    }
}

