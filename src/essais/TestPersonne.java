package essais;
import entites.AdressePostale;
import entites.Personne;
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        personne1.nom = "Jean";
        personne1.prenom = "Marue";
        personne1.adresse = new AdressePostale();

        Personne personne2 = new Personne();
        personne2.nom = "Jeanne";
        personne2.prenom = "Marue";
        personne2.adresse = personne1.adresse;

        personne1.adresse.numeroRue = 4;
        personne1.adresse.libelleRue = "Marue";
        personne1.adresse.codePostal = 44300;
        personne1.adresse.ville = "Nantes";
    }
}

